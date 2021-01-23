package com.somnambulist.java.utils;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpRequest;

public class MyHttps {

    //获取ESURL
    public static String getAvailableEsUrl() {

        String url="http://{}:{}";
        for (String node : ServerConfig.ELASTICSEARCH_CLUSTER_NODE.split(",")) {
            url= StrUtil.format(url,node,ServerConfig.ELASTICSEARCH_CLUSTER_PORT);
            int status = HttpRequest.get(url)
                    .timeout(1000 * 5)
                    .execute()
                    .getStatus();
            if(status==200){
                return url ;
            }

        }
        return  "ERROR CLASTER NODES";
    }





}
