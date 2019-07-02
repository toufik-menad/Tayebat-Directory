/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.controllers;

import com.services.SourceLoaderService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author T.Menad
 */
@RestController
@RequestMapping(value="/admin")
public class AdminController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    
    @Autowired
    private SourceLoaderService sourceLoaderService;
    
    @PostMapping()
    public void bootstrap() throws Exception {
        logger.info("Enter ...");
        sourceLoaderService.persistCodes("../codes.csv");
    }

}
