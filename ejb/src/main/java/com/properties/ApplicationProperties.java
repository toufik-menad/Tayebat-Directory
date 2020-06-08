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
    private int NUMBER_THREADS;
    private int CHUNK_SIZE;

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

    /**
     * Getter for nUMBER_THREADS.
     * @return the nUMBER_THREADS
     */
    public int getNUMBER_THREADS() {
        return NUMBER_THREADS;
    }

    /**
     * Setter for nUMBER_THREADS.
     * @param nUMBER_THREADS the nUMBER_THREADS to set
     */
    public void setNUMBER_THREADS(int nUMBER_THREADS) {
        NUMBER_THREADS = nUMBER_THREADS;
    }

    /**
     * Getter for cHUNK_SIZE.
     * @return the cHUNK_SIZE
     */
    public int getCHUNK_SIZE() {
        return CHUNK_SIZE;
    }

    /**
     * Setter for cHUNK_SIZE.
     * @param cHUNK_SIZE the cHUNK_SIZE to set
     */
    public void setCHUNK_SIZE(int cHUNK_SIZE) {
        CHUNK_SIZE = cHUNK_SIZE;
    }

}
