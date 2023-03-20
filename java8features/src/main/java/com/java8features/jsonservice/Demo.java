package com.java8features.jsonservice;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("src/main/resources/employee.json");
        JSONArray jsonArray=new JSONArray();
        for(long i=0;i<1000000;i++)
        {
            JSONObject jsonObject1=new JSONObject();
            jsonObject1.put("empid",i);
            jsonObject1.put("empname","testname"+i);
            jsonObject1.put("salary",String.valueOf(i*10));
            jsonObject1.put("address","dummyAddress"+i);
            jsonArray.add(jsonObject1);
        }
        fileWriter.write(jsonArray.toJSONString());
        fileWriter.close();






    }
}
