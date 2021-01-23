package com.somnambulist.java.utils;

import org.apache.spark.SparkConf;
import org.apache.spark.sql.SparkSession;

/**
 * Created by wangjunyong on 2021/1/8 14:45
 */
public class SparkUtils {

    private SparkUtils() {
    }


    public static SparkSession initSparkSession() {
        System.setProperty("hadoop.home.dir", "D:\\appinstall");
        System.setProperty("HADOOP_USER_NAME", "bbdoffline");
        SparkConf conf = new SparkConf();
        conf.setAppName("job-local");
        conf.setMaster("local");
        SparkSession sparkSession = SparkSession.builder().config(conf).getOrCreate();
        sparkSession.sparkContext().setLogLevel("WARN");
        return sparkSession;

    }

}
