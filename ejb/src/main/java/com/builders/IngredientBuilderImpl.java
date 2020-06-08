/*
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.builders;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import core.com.entities.jpaentities.IngredientEntity;

/**
 * @author T.Menad
 */
@Service
public class IngredientBuilderImpl implements IngredientBuilder<IngredientEntity> {

    /**
     * @param indredient_text
     * @return
     */
    @Override
    public List<IngredientEntity> populateIngredients(final String ingredient_text) {
        final List<IngredientEntity> ingredients = new ArrayList<>();
        final String[] ingredientsFromText = ingredient_text.split(",");
        int rank = 0;
        for (int i = 0; i < ingredientsFromText.length; i++) {
            final IngredientEntity ingredientEntity = new IngredientEntity(UUID.randomUUID(), rank, ingredientsFromText[i]);
            ingredients.add(ingredientEntity);
            rank++;
        }

        return ingredients;
    }

}
