/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.services;

import java.util.List;

/**
 * @author T.Menad
 * @param <ProductEntity>
 */

public interface ProductSearchService<T> {
    
    /**
     * Gets {@link ProductEntity} by barCode.
     * @param barCode
     * @return
     */
    public List<T> searchProductByBarCode(final String barCode);
    
    public List<T> searchIngredientByProduct(final String barCode);
}
