package com.nc.autumn2020.solutions.lesson6.task1_url_holder;

import com.nc.autumn2020.LessonApi;
import com.nc.autumn2020.lessons.lesson6.UrlHolder;
import com.nc.autumn2020.lessons.lesson6.UrlHolderFactory;

public class ClassForUrlHolder implements LessonApi {
    @Override
    public void executeSolution(String[] args) {

        System.out.println(UrlHolderFactory.createInstance("http://localhost.netcracker.com:6810/somproduct.plain_taskc.nc?tab=_Task&object=9090363151013783084&container=9158610804913819337&task=9158610807913819337&state=update&return=%2Fcommon%2Fuobject.jsp%3Fobject%3D9158610804913819337&object=9090363151013783084"));
        System.out.println("--------------------------------------");
        System.out.println(UrlHolderFactory.createInstance("https://goldbusinessnet.com/kompyuter-i-internet/url-adres-chto-eto-takoe-kak-uznat/"));
        System.out.println("--------------------------------------");
        System.out.println(UrlHolderFactory.createInstance("https://www.youtube.com/watch?v=4RWRwzyI2vA&feature=emb_logo"));
        System.out.println("--------------------------------------");
        System.out.println(UrlHolderFactory.createInstance("http://proglang.su/java/classes-and-objects"));
        System.out.println("--------------------------------------");
        System.out.println(UrlHolderFactory.createInstance("https://skillfactory.ru/java?roistat_referrer=proglang.su&roistat_pos=none&roistat=google10_d_111754925960_465838420990_&utm_source=google&utm_medium=cpc&utm_campaign=sf_java_google_site_channel&gclid=EAIaIQobChMIreuEmqPm7AIVWu-yCh1kGAlyEAEYASAAEgJ4Y_D_BwE"));
        System.out.println("--------------------------------------");
    }
}
