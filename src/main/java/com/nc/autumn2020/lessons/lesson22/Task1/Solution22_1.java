package com.nc.autumn2020.lessons.lesson22.Task1;

import com.nc.autumn2020.LessonApi;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan(
        basePackages = "com.nc.autumn2020.lessons.lesson22.Task11"
)
public class Solution22_1 implements LessonApi {


    @Override
    public void executeSolution(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("conf.xml");

        AudioPlayer audioPlayer = (AudioPlayer) applicationContext.getBean("com.nc.autumn2020.lessons.lesson22.Task1.AudioPlayer");
        LoveRadio loveRadio = (LoveRadio) applicationContext.getBean("com.nc.autumn2020.lessons.lesson22.Task1.LoveRadio");
        EuropaPlus europaPlus = (EuropaPlus) applicationContext.getBean("com.nc.autumn2020.lessons.lesson22.Task1.EuropaPlus");

        audioPlayer.playSongs();
        audioPlayer.selectAnotherRadio(loveRadio);
        audioPlayer.playSongs();

        audioPlayer.selectAnotherRadio(europaPlus);
        audioPlayer.playSongs();



    }
}
