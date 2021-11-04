package com.elite.kvijay9.controller;

import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TinyUrl {

    public static void main(String[] args) {

        /*String bigUrl = "http://localhost:8765/web/redirect?to=sso&sso-identifier=4cc6c1c87b90b49d8c468ec3b33789a650f2d7f09dc2e35a&assertion=eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODZjNTRiMi1mYWIzLTRkZWYtOWY4Ny1iNzdjYzU0N2UwMTQiLCJhdWQiOiJkN2RmN2I0Yjc1NzhmNWVkZTAwMGM0NTlkZWMwZDhmZTU5ZGI5MTFlNzRhZjM2MGUiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwiYXpwIjoiZDdkZjdiNGI3NTc4ZjVlZGUwMDBjNDU5ZGVjMGQ4ZmU1OWRiOTExZTc0YWYzNjBlIiwiYW1yIjpbInB3ZCIsInNxYSIsIm1mYSJdLCJhdXRoX3RpbWUiOjE2MzMxMDYxNzIsImlzcyI6Imh0dHA6XC9cL2xvY2FsaG9zdDo4NzY1IiwiZXhwIjoxNjMzMTEyMzUwLCJpYXQiOjE2MzMxMDYzNTAsIm5vbmNlIjoiT25aSDNZZHp0SDhFaW5iODZza1RvdHZYQS1FbFBEbndlNnlTN2VFdWVZayIsImVtYWlsIjoic3BlbnQtd2hhbGVAZ3ZoMHJoMGIubWFpbG9zYXVyLm5ldCJ9.32YzA4_TZLg7oSc3lah3twq4of0lNV7kiaqiinweBPs&redirect-uri=https%3A%2F%2Fabc.com";
        String allChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // 7 chars

        int i = Integer.MAX_VALUE;
        //for (;i <= i ; i++) {
            int n = i;
            StringBuilder s = new StringBuilder();
            while(n > 0) {
                int rem = n%62;
                s.append(allChars.charAt(rem));
                n = n/62;
            }
            System.out.println(s.toString());*/
        // }



    }
}
