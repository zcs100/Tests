package com.spring.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

/**
 * Created by szc on 16/11/14.
 */
public class FirstJob extends QuartzJobBean {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        log.info("execute schedule,the time is:"+ new Date());
        try{
            Thread.sleep(1000*60);
        }catch (InterruptedException e){
            log.error("InterruptedException happen..........");
        }
    }
}
