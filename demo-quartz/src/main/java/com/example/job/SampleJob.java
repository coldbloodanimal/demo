package com.example.job;

import com.example.service.SampleService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author: Monster
 * @date: 2019-08-02 16:23
 **/
public class SampleJob extends QuartzJobBean {

    @Autowired
    private SampleService sampleService;

    private String name;

    // Inject "MyService" bean
    public void setMyService(SampleService sampleService) {  }

    // Inject the "name" job data property
    public void setName(String name) {  }


    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {

    }
}