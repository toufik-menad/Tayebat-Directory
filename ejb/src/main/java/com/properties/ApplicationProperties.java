/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.properties;

/**
 * @author T.Menad
 */
public class ApplicationProperties {
    private String MONGO_DATABASE_NAME;

    /**
     * Getter for mONGO_DATABASE_NAME.
     * @return the mONGO_DATABASE_NAME
     */
    public String getMONGO_DATABASE_NAME() {
        return MONGO_DATABASE_NAME;
    }

    /**
     * Setter for mONGO_DATABASE_NAME.
     * @param mONGO_DATABASE_NAME the mONGO_DATABASE_NAME to set
     */
    public void setMONGO_DATABASE_NAME(String MONGO_DATABASE_NAME) {
        this.MONGO_DATABASE_NAME = MONGO_DATABASE_NAME;
    }
    

}
