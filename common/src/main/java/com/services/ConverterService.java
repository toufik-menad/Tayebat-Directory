/*
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.services;

/**
 * @author T.Menad
 */
public interface ConverterService<D, P> {

    public P convertToProductEntity(D productDocument);

}
