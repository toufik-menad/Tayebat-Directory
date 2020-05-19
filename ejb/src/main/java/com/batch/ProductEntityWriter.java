/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.batch;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import core.com.entities.jpaentities.ProductEntity;
import core.com.repositories.jparepositories.ProductEntityRepository;

/**
 * @author T.Menad
 */
@Component
public class ProductEntityWriter implements ItemWriter<ProductEntity>{
    @Autowired
    ProductEntityRepository productEntityRepository;
    
    Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * @param items
     * @throws Exception
     */
    @Override
    @Transactional
    public void write(List<? extends ProductEntity> productEntities) throws Exception {
        productEntityRepository.saveAll(productEntities);
    }


}
