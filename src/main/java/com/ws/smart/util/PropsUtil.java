package com.ws.smart.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by wushuai on 16/4/28.
 */
public class PropsUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);
    private static Properties props;

     static {

        InputStream is = null;
        try {
            is = Thread.currentThread().getContextClassLoader().getResourceAsStream("/config.properties");
            if (is == null){
                throw  new Exception("config.properties" + "file is not found");
            }
            props = new Properties();
            props.load(is);

        }catch (Exception e){
            LOGGER.error("load properties file failure",e);

        }finally {
            if (is!=null){
                try {
                    is.close();
                }catch (IOException e){
                    LOGGER.error("close input stream failure",e);
                }
            }
        }

    }

    public static String getProps(String key){
        String value ="";
        if (props.containsKey(key)){

            value = props.getProperty(key);
        }
        return value;
    }






















}
