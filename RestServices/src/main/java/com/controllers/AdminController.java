/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.controllers;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author T.Menad
 */
@RestController
@RequestMapping("admin")
public class AdminController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    
    @Autowired
    public JobLauncher jobLauncher;
    
    @Autowired
    public Job job;
    
    @PostMapping("/start")
    public @ResponseBody BatchStatus bootstrap() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {
        logger.info("Enter ...");
        final Map<String, JobParameter> params = new HashMap<>();
        params.put("time", new JobParameter(System.currentTimeMillis()));
        final JobParameters jobParameters = new JobParameters(params);
        return jobLauncher.run(job, jobParameters).getStatus();
        
    }

}
