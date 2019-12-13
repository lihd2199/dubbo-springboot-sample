package com.dubbo.springboot.sample.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com."})
public class DubboSpringbootSampleCustomerApplication {

    public static void main(String[] args) {

        SpringApplication.run(DubboSpringbootSampleCustomerApplication.class, args);

    }

}
