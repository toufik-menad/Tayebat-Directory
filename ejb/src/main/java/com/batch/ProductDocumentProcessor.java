/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.batch;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import core.com.entities.jpaentities.ProductEntity;
import core.com.entities.mongoentities.ProductDocument;

/**
 * @author T.Menad
 */
@Component
public class ProductDocumentProcessor implements ItemProcessor<ProductDocument,ProductEntity>{
    
    Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * @param productDocument {@link ProductDocument}
     * @return {@link ProductEntity}
     * @throws Exception
     */
    @Override
    public ProductEntity process(ProductDocument productDocument) throws Exception {
        final ProductEntity productEntity = new ProductEntity();
        productEntity.setCode(productDocument.get_id());
        logger.info("Processign product id {} with thread {}: ", productDocument.get_id(), Thread.currentThread().getName());
        return productEntity;
    }
    
   

}
