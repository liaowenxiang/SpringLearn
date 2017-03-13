package com.lwx.springdemo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/2/27.
 */
@Configuration

public class Config {
    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }
    @Bean
    public UseFunctionService useFunctionService(FunctionService functionService){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }

}
