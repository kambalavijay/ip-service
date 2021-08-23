package com.elite.kvijay9;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public final class BeautifulNumber {

    private BeautifulNumber(){

    }

    public static void main(String[] args) throws IOException {

        String str = "{\"id\":1,\"name\":\"Vijay\",\"email\":\"kambalavijay@gmail.com\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        Student student = objectMapper.readValue(str, Student.class);

        System.out.println(student);




    }

    /*
    However the problem with this algorithm is that it is exceeding time limit set by hackerearth
    * */
    private static boolean isBeautifulNum(int n){
        int iSum = 0;
        while (n > 0) {
            iSum = iSum + (int) Math.pow(n % 10, 2);
            n = n / 10;
        }
        return iSum >= 0 && iSum <= 9 ?
                (iSum == 1 || iSum == 7) : isBeautifulNum(iSum);
        /*if (iSum >= 0 && iSum <= 9){
            return iSum == 1 || iSum == 7;
        }
        return isBeautifulNum(iSum);*/


    }
}

