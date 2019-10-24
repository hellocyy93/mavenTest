package com.java.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.java.bean.FastjsonReq;

public class FastjsonDemo {
    public static void main(String[] args) {
      /*  String req = "{ 'name' : 'Yuan', 'idNo' : '9527', 'adress': '中国安徽'}";
        FastjsonReq fastjsonReq = JSON.parseObject(req, FastjsonReq.class);
        System.out.println(fastjsonReq.toString());*/
        FastjsonReq fastjsonReq = new FastjsonReq();
        fastjsonReq.setName("jack");
        fastjsonReq.setIdNo("9528");
        String s = JSON.toJSONString(fastjsonReq, SerializerFeature.WriteNullStringAsEmpty);
        System.out.println(s);


    }
}
