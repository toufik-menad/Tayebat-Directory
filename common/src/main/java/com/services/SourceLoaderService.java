/*
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.services;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 * @author T.Menad
 */

public interface SourceLoaderService {

    
    /** Loads files from URLs.
     * @param url
     * @param filePath
     * @throws MalformedURLException
     * @throws IOException
     */
    public void loadFile(final String url, final String filePath) throws MalformedURLException, IOException;
    
    /**Persist codes into the database.
     * @param resource
     * @throws Exception 
     */
    public void persistCodes(final String path) throws Exception;
    
    

}
