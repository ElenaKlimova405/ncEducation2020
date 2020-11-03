package com.nc.autumn2020.lessons.lesson6;

import com.nc.autumn2020.LessonApi;

import java.io.File;
import java.util.Map;
import java.util.Properties;

public class SystemPropertyInfo implements LessonApi {
    @Override
    public void executeSolution(String[] args) {

        Map<String, String> getenv = System.getenv();
        Properties properties = System.getProperties();
        System.getProperties().setProperty("user.dir", "C:"+ File.separator+"Users\\anmi0217\\Documents\\1work\\Education\\plugins");
        for (Map.Entry<Object, Object> propertyKeyValue : properties.entrySet()) {
            System.out.printf("key = %s value = %s\n",propertyKeyValue.getKey(),propertyKeyValue.getValue());
        }

    }
}