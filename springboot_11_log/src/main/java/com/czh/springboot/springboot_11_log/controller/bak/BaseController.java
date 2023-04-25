package com.czh.springboot.springboot_11_log.controller.bak;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseController {
    private static Class clazz ;
    public static  Logger LOG;

    public BaseController() {
        clazz=this.getClass();
        LOG=LoggerFactory.getLogger(clazz);
    }


}
