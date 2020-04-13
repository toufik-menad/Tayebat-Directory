/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.batch;

import java.util.List;

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

    /**
     * @param items
     * @throws Exception
     */
    @Override
    public void write(List<? extends ProductEntity> productEntities) throws Exception {
        productEntityRepository.saveAll(productEntities);
    }


}
