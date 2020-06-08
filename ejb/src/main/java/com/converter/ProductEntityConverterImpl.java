/*
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.converter;

import com.builders.IngredientBuilder;
import com.services.ConverterService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.commons.lang3.StringUtils;

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
    private ProductEntityRepository productEntityRepository;

    @Autowired
    private IngredientBuilder<IngredientEntity> ingredientBuilder;

    Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * @param ProductDocument
     * @return
     */
    @Override
    public ProductEntity convertToProductEntity(ProductDocument productDocument) {
        if (productEntityRepository.findByCode(productDocument.getCode()) != null) {
            logger.info("UPDATE ============>  Processing product code: {}", productDocument.getCode());

            final ProductEntity productEntity = productEntityRepository.findByCode(productDocument.getCode());

            productEntity.setCode(productDocument.get_id());

            productEntity.setProduct_name(productDocument.getProduct_name());
            productEntity.setProduct_name_en(productDocument.getProduct_name_en());
            productEntity.setProduct_name_de(productDocument.getProduct_name_de());
            productEntity.setProduct_name_es(productDocument.getProduct_name_es());
            productEntity.setProduct_name_it(productDocument.getProduct_name_it());
            productEntity.setProduct_name_fr(productDocument.getProduct_name_fr());

            if (StringUtils.isNoneBlank(productDocument.getIngredients_text())) {
                productEntity.getIngredients_text().clear();
                ingredientBuilder.populateIngredients(productDocument.getIngredients_text()).stream().forEach(ingredient -> {
                    productEntity.addIngredientTextEntity(ingredient);
                });
            }

            if (StringUtils.isNoneBlank(productDocument.getIngredients_text_en())) {
                productEntity.getIngredients_text_en().clear();
                ingredientBuilder.populateIngredients(productDocument.getIngredients_text_en()).stream().forEach(ingredient -> {
                    productEntity.addIngredientTextEnEntity(ingredient);
                });
            }

            if (StringUtils.isNoneBlank(productDocument.getIngredients_text_de())) {
                productEntity.getIngredients_text_de().clear();
                ingredientBuilder.populateIngredients(productDocument.getIngredients_text_de()).stream().forEach(ingredient -> {
                    productEntity.addIngredientTextDeEntity(ingredient);
                });
            }

            if (StringUtils.isNoneBlank(productDocument.getIngredients_text_it())) {
                productEntity.getIngredients_text_it().clear();
                ingredientBuilder.populateIngredients(productDocument.getIngredients_text_it()).stream().forEach(ingredient -> {
                    productEntity.addIngredientTextItEntity(ingredient);
                });
            }

            if (StringUtils.isNoneBlank(productDocument.getIngredients_text_es())) {
                productEntity.getIngredients_text_es().clear();
                ingredientBuilder.populateIngredients(productDocument.getIngredients_text_es()).stream().forEach(ingredient -> {
                    productEntity.addIngredientTextEsEntity(ingredient);
                });
            }

            if (StringUtils.isNoneBlank(productDocument.getIngredients_text_fr())) {
                productEntity.getIngredients_text_fr().clear();
                ingredientBuilder.populateIngredients(productDocument.getIngredients_text_fr()).stream().forEach(ingredient -> {
                    productEntity.addIngredientTextFrEntity(ingredient);
                });
            }

            return productEntity;
        } else {
            
            logger.info("INSERT ============>  Processing product code: {}", productDocument.getCode());
            
            final ProductEntity productEntity = new ProductEntity();

            productEntity.setCode(productDocument.getCode());

            productEntity.setProduct_name(productDocument.getProduct_name());
            productEntity.setProduct_name_en(productDocument.getProduct_name_en());
            productEntity.setProduct_name_de(productDocument.getProduct_name_de());
            productEntity.setProduct_name_es(productDocument.getProduct_name_es());
            productEntity.setProduct_name_it(productDocument.getProduct_name_it());
            productEntity.setProduct_name_fr(productDocument.getProduct_name_fr());

            if (StringUtils.isNoneBlank(productDocument.getIngredients_text())) {
                ingredientBuilder.populateIngredients(productDocument.getIngredients_text()).stream().forEach(ingredient -> {
                    productEntity.addIngredientTextEntity(ingredient);
                });
            }

            if (StringUtils.isNoneBlank(productDocument.getIngredients_text_en())) {
                ingredientBuilder.populateIngredients(productDocument.getIngredients_text_en()).stream().forEach(ingredient -> {
                    productEntity.addIngredientTextEnEntity(ingredient);
                });
            }

            if (StringUtils.isNoneBlank(productDocument.getIngredients_text_de())) {
                ingredientBuilder.populateIngredients(productDocument.getIngredients_text_de()).stream().forEach(ingredient -> {
                    productEntity.addIngredientTextDeEntity(ingredient);
                });
            }

            if (StringUtils.isNoneBlank(productDocument.getIngredients_text_it())) {
                ingredientBuilder.populateIngredients(productDocument.getIngredients_text_it()).stream().forEach(ingredient -> {
                    productEntity.addIngredientTextItEntity(ingredient);
                });
            }

            if (StringUtils.isNoneBlank(productDocument.getIngredients_text_es())) {
                ingredientBuilder.populateIngredients(productDocument.getIngredients_text_es()).stream().forEach(ingredient -> {
                    productEntity.addIngredientTextEsEntity(ingredient);
                });
            }

            if (StringUtils.isNoneBlank(productDocument.getIngredients_text_fr())) {
                ingredientBuilder.populateIngredients(productDocument.getIngredients_text_fr()).stream().forEach(ingredient -> {
                    productEntity.addIngredientTextFrEntity(ingredient);
                });
            }
            return productEntity;
        }
    }

}
