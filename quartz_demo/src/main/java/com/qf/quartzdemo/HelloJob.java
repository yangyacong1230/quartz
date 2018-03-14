package com.qf.quartzdemo;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Dylan:Stay hungry, stay foolish.
 * Date: 2018/3/9 20:36
 */
public class HelloJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println("在" + sdf.format(new Date()) + "扒取新闻" + Thread.currentThread().getName());
    }
}
