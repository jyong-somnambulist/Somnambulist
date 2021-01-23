package com.somnambulist.java.utils;

public class ServerConfig {
    private ServerConfig(){}

    public final static String CLUSTER_NODE="47.116.1.156";
    public final static Integer REDIS_PORT=6379;

    //ELASTICSEARCH集群配置信息
    public final static String ELASTICSEARCH_CLUSTER_NODE="node01,node02,node03";
    public final static Integer ELASTICSEARCH_CLUSTER_PORT=9200;

    public final static Integer MYSQL_REDIS=3306;
    public final static String MYSQL_USER="root";
    public final static String MYSQL_PASSWORD="123456";


}
