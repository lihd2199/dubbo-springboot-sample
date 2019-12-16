package com.dubbo.springboot.sample.server.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

/**
 * @program: dubbo-parent
 * @description:
 * @author: li_hd
 * @create: 2019-12-13 17:07
 **/
public class DubboSPITest {

    @Test
    public void sayHello() throws Exception {
        ExtensionLoader<Robot> extensionLoader =
                ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
    }


}
