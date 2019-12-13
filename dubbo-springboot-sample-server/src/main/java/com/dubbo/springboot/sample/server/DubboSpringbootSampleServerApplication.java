package com.dubbo.springboot.sample.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class DubboSpringbootSampleServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringbootSampleServerApplication.class,args);
    }

}
