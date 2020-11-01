package com.nc.autumn2020.lesson6;

import com.nc.autumn2020.LessonApi;

import java.io.File;
import java.util.Map;
import java.util.Properties;

public class SystemPropertyInfo implements LessonApi {
    @Override
    public void executeSolution(String[] args) {
        Map<String, String> getenv = System.getenv();

        Properties properties = System.getProperties();
        for (Map.Entry<Object, Object> propertyKeyValue : properties.entrySet()) {
            System.out.printf("key = %s value = %s\n", propertyKeyValue.getKey(), propertyKeyValue.getValue());
        }

        System.getProperties().setProperty("user.dir", "F:"+ File.separator+"Disc C"+ File.separator+"education");




    }
}
