package com.elite.kvijay9;

import org.springframework.stereotype.Component;

@Component
public class Behaviour2 {
    public int m2(String sum){
        int x = 10;
        int y = 20;
        System.out.println(sum + " = " + (x+y));
        return x+y;
    }
}
