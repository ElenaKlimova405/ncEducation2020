package com.nc.autumn2020.lessons.lesson22;

import com.nc.autumn2020.LessonApi;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class
Solution22 implements LessonApi {


    @Override
    public void executeSolution(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("conf.xml");

        AudioPlayer audioPlayer = (AudioPlayer) applicationContext.getBean("A");
        LoveRadio loveRadio = (LoveRadio) applicationContext.getBean("L");
        EuropaPlus europaPlus = (EuropaPlus) applicationContext.getBean("E");

        audioPlayer.playSongs();
        audioPlayer.selectAnotherRadio(loveRadio);
        audioPlayer.playSongs();

        audioPlayer.selectAnotherRadio(europaPlus);
        audioPlayer.playSongs();



    }
}
