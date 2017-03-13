package com.lwx.springdemo11;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Administrator on 2017/3/13.
 */
@Configuration
@ComponentScan("com.lwx.springdemo11")
@EnableScheduling
public class TaskSchedulerConfig {

}
