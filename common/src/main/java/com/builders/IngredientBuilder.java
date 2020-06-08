/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.builders;

import java.util.List;

/**
 * @author T.Menad
 */
public interface IngredientBuilder<I> {
    
    public List<I> populateIngredients(final String indredient_text);

}
