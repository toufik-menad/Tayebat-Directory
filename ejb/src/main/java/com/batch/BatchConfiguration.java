/*
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.batch;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;

import javax.transaction.Transactional;

import com.mongodb.MongoClient;
import com.properties.ApplicationProperties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.data.MongoItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.scheduling.concurrent.ConcurrentTaskExecutor;

import core.com.entities.jpaentities.ProductEntity;
import core.com.entities.mongoentities.ProductDocument;

/**
 * @author T.Menad
 */
@Configuration
@EnableBatchProcessing
@Transactional
public class BatchConfiguration {
    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    public ProductEntityWriter productEntityWriter;

    @Autowired
    public ProductDocumentProcessor productDocumentProcessor;
    
    @Autowired
    public MongoTemplate mongoTemplate;

    Logger logger = LoggerFactory.getLogger(getClass());

    @Bean
    public MongoItemReader<ProductDocument> mongoItemReader() throws Exception {
        MongoItemReader<ProductDocument> mongoItemReader = new MongoItemReader<>();
        mongoItemReader.setTemplate(mongoTemplate());
        mongoItemReader.setCollection("PRODUCTS");
        mongoItemReader.setQuery("{}");
        mongoItemReader.setTargetType(ProductDocument.class);
        Map<String, Sort.Direction> sort = new HashMap<>();
        sort.put("_id", Sort.Direction.ASC);
        mongoItemReader.setSort(sort);
        return mongoItemReader;
    }

    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception {
        return new SimpleMongoDbFactory(new MongoClient(), getApplicationProperties().getMONGO_DATABASE_NAME());
    }

    @Bean
    @ConfigurationProperties(prefix = "tayebat")
    public ApplicationProperties getApplicationProperties() {
        return new ApplicationProperties();
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
        return mongoTemplate;
    }

    @Bean
    public TaskExecutor taskExecutor() {        
       return new ConcurrentTaskExecutor(Executors.newFixedThreadPool(5));
    }

    @Bean
    public Step importStep() throws Exception {
        return stepBuilderFactory.get("importStep").<ProductDocument, ProductEntity> chunk(10).reader(mongoItemReader()).processor(
                productDocumentProcessor).writer(productEntityWriter).taskExecutor(taskExecutor()).build();
    }

    @Bean
    public Job importProductDocuments() throws Exception {
        return jobBuilderFactory.get("importProductDocuments").start(importStep()).build();
    }

}
