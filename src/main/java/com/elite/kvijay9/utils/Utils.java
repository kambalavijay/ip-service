package com.elite.kvijay9.utils;

import org.springframework.web.client.RestTemplate;

public class Utils {
    private Utils(){
        throw new IllegalArgumentException();
    }

    public static String trim(String s){
        RestTemplate restTemplate = new RestTemplate();
        return s.trim();
    }
}
