package com.java.test;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;

public class ArrTest {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        if(CollectionUtils.isEmpty(arrayList)){
            System.out.println("+++++++++++++++");
        }
    }
}
