package com.elite.kvijay9;

import org.springframework.stereotype.Component;

@Component
public class Behaviour1 {
    private Behaviour2 behaviour2;
    public Behaviour1(Behaviour2 behaviour2) {
        this.behaviour2 = behaviour2;
    }

    int m1(int a, int b){
        behaviour2.m2("sum");
        int c = a+b;
        return c;
    }
}
