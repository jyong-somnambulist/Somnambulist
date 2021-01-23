package com.somnambulist.commons.session;

import cn.hutool.db.DbUtil;
import cn.hutool.db.Session;
import cn.hutool.db.ds.simple.SimpleDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by jyong on 2021/1/23 16:12
 */
public class SessionUtils {

    private SessionUtils() {
    }

    public static Session initDbSession() {
        InputStream resourceAsStream = SessionUtils.class.getResourceAsStream("config.properties");
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SimpleDataSource simpleDataSource = new SimpleDataSource(properties.getProperty("mysql.url"), properties.getProperty("mysql.user"), properties.getProperty("mysql.password"), properties.getProperty("mysql.driver"));
        return DbUtil.newSession(simpleDataSource);

    }

}
