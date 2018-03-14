package com.qf.quartzdemo;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Dylan:Stay hungry, stay foolish.
 * Date: 2018/3/9 20:38
 */
public class FirstTrigger {

    public static void main(String[] args) throws SchedulerException {

        //创建job
        JobBuilder jobBuilder = JobBuilder.newJob(HelloJob.class);
        JobDetail jobl = jobBuilder.withIdentity("我的第一个任务","1组").build();

        //创建触发器
       Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("我的第一个触发器","1组")
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInMilliseconds(3000).repeatForever())
                .build();

        //创建调度器
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.scheduleJob(jobl,trigger);
        scheduler.start();

    }
}
