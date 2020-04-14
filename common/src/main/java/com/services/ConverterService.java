/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.services;

/**
 * @author T.Menad
 */
public interface ConverterService<T,U> {
    
    public T convertToProductEntity(U DocumentEntity);
    

}
