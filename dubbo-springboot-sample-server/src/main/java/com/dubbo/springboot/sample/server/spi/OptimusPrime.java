package com.dubbo.springboot.sample.server.spi;

/**
 * @program: lihd-java
 * @description:
 * @author: li_hd
 * @create: 2019-12-13 16:30
 **/
public class OptimusPrime implements Robot {

    @Override
    public void sayHello() {

        System.out.println("Hello, I am Optimus Prime.");

    }
}