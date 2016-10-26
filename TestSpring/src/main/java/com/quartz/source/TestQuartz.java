package com.quartz.source;

import org.junit.Test;
import org.quartz.Job;
import static org.quartz.JobBuilder.newJob;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created by szc on 16/9/30.
 */
public class TestQuartz {

    class HelloJpb implements Job{
        public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
            System.out.println("===================");
        }
    }

    @Test
    public void testQuartz(){
        JobDetail jobDetail = newJob(HelloJpb.class)
                .withIdentity("myJob", "group1")
                .build();
    }

}
