/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.converter;

import com.services.ConverterService;

import org.springframework.stereotype.Service;

import core.com.entities.jpaentities.ProductEntity;
import core.com.entities.mongoentities.ProductDocument;

/**
 * @author T.Menad
 */
@Service
public class ProductEntityConverterImpl implements ConverterService<ProductDocument, ProductEntity>{

    /**
     * @param DocumentEntity
     * @return
     */
    @Override
    public ProductDocument convertToProductEntity(ProductEntity DocumentEntity) {
        // TODO Auto-generated method stub
        return null;
    }



}
