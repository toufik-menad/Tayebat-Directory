/*
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.serviceImpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.services.SourceLoaderService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.commons.io.FileUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import core.com.pojo.CodePojo;
import core.com.repositories.FileRepository;

/**
 * @author T.Menad
 */
@Service
public class SourceLoaderServiceImpl implements SourceLoaderService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private FileRepository fileRepository;

    /**
     * {@inheritDoc}
     * 
     * @param url
     * @throws IOException
     * @throws MalformedURLException
     */
    @Override
    public void loadFile(String url, final String filePath) throws MalformedURLException, IOException {
        FileUtils.copyURLToFile(new URL(url), new File(filePath), 4000, 4000);
    }

    /**
     * {@inheritDoc}
     * 
     * @param resource
     * @throws Exception
     */
    @Override
    public void persistCodes(final String filePath) throws Exception {

        try {
            
            final BufferedReader br = new BufferedReader(new FileReader(filePath));
            final Reader reader = Files.newBufferedReader(Paths.get(filePath));
            final CsvToBean<CodePojo> csvToBean = new CsvToBeanBuilder<CodePojo>(reader).withType(CodePojo.class).withIgnoreLeadingWhiteSpace(
                    true).build();
            csvToBean.forEach(pojo -> {
                logger.info("pojo code: {}", pojo.getCode());
            });

        } catch (final IOException ex) {
            throw new Exception("throw");
        }
    }

}
