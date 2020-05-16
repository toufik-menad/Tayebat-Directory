/*
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.converter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.services.ConverterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import core.com.entities.jpaentities.IngredientEntity;
import core.com.entities.jpaentities.ProductEntity;
import core.com.entities.mongoentities.ProductDocument;

/**
 * @author T.Menad
 */
@Service
public class ProductEntityConverterImpl implements ConverterService<ProductDocument, ProductEntity> {

    @Autowired
    private ObjectMapper objectMapper;

    /**
     * @param ProductDocument
     * @return
     */
    @Override
    public ProductEntity convertToProductEntity(ProductDocument productDocument) {
        final ProductEntity productEntity = new ProductEntity();
        productEntity.setCode(productDocument.getCode());
        this.buildIngredientList(productDocument).forEach(ingredientEntity -> {
            productEntity.addIngredientEntity(ingredientEntity);
        });
        return productEntity;
    }

    private List<IngredientEntity> buildIngredientList(final ProductDocument productDocument) {
        final List<IngredientEntity> ingredientEntities = new ArrayList<>();
        productDocument.getIngredients().forEach(x -> {
            try {
                ingredientEntities.add(objectMapper.readValue(x, IngredientEntity.class));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        return ingredientEntities;
    }

}
