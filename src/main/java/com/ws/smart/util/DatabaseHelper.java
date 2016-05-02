package com.ws.smart.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by wushuai on 16/4/30.
 */
public class DatabaseHelper {
    public static final String USERNAME;
    public static final String PASSWORD;
    public static final String URL;
    public static final String DRIVER;
    public static Logger logger = LoggerFactory.getLogger(DatabaseHelper.class);

    static{
        USERNAME = PropsUtil.getProps("jdbc.username");
        PASSWORD = PropsUtil.getProps("jdbc.password");
        URL = PropsUtil.getProps("jdbc.url");
        DRIVER = PropsUtil.getProps("jdbc.driver");

        try {
            Class.forName(DRIVER);
        }catch (Exception e){
            logger.error("can not load jdbc driver",e);
        }
    }

    public static Connection getConn(){
        Connection conn =null;
        try {
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }catch (Exception e){
            logger.error(" get connection failure",e);
        }
        return conn;
    }

    public static  void close(Connection conn){

        if (conn!=null ){
            try {
                conn.close();
            } catch (SQLException e) {
                logger.error("close connection failure",e);
            }
        }
    }




}
