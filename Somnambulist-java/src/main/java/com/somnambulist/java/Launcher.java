package com.somnambulist.java;


import cn.hutool.http.HttpRequest;

public class Launcher {
    public static void main(String[] args) {

        String url="https://www.biquge4.net/book/122480";
        String body = HttpRequest.get(url).execute().body();
        System.out.println(body);


    }
}
