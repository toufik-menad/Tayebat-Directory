/*
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.converter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.services.ConverterService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import core.com.entities.jpaentities.IngredientEntity;
import core.com.entities.jpaentities.ProductEntity;
import core.com.entities.mongoentities.ProductDocument;
import core.com.repositories.jparepositories.ProductEntityRepository;

/**
 * @author T.Menad
 */
@Service
public class ProductEntityConverterImpl implements ConverterService<ProductDocument, ProductEntity> {

    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private ProductEntityRepository productEntityRepository;
    
    Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * @param ProductDocument
     * @return
     */
    @Override
    public ProductEntity convertToProductEntity(ProductDocument productDocument) {
        if (productEntityRepository.findByCode(productDocument.getCode()) != null) {
            final ProductEntity productEntity = productEntityRepository.findByCode(productDocument.getCode());
            productEntity.setCode(productDocument.getCode());
            productEntity.setProduct_name(productDocument.getProduct_name());
            productEntity.setIngredients_text(productDocument.getIngredients_text());
            this.buildIngredientList(productDocument).forEach(ingredientEntity -> {
                productEntity.addIngredientEntity(ingredientEntity);
            });
            return productEntity;
        } else {
            final ProductEntity productEntity = new ProductEntity();
            productEntity.setCode(productDocument.getCode());
            productEntity.setIngredients_text(productDocument.getIngredients_text());
            this.buildIngredientList(productDocument).forEach(ingredientEntity -> {
                productEntity.addIngredientEntity(ingredientEntity);
            });
            return productEntity;
        }
    }

    private List<IngredientEntity> buildIngredientList(final ProductDocument productDocument) {
        final List<IngredientEntity> ingredientEntities = new ArrayList<>();
        productDocument.getIngredients().forEach(x -> {
            try {
                ingredientEntities.add(objectMapper.readValue(x, IngredientEntity.class));
            } catch (IOException e) {
                e.printStackTrace();
                logger.info("product document with id {} is skipped", productDocument.get_id());
            }
        });
        return ingredientEntities;
    }

}
