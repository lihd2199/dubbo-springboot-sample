package com.dubbo.springboot.sample.server.spi;

import org.apache.dubbo.common.extension.SPI;

/**
 * @program: lihd-java
 * @description:
 * @author: li_hd
 * @create: 2019-12-13 16:29
 **/
@SPI
public interface Robot {


    void sayHello();


}
