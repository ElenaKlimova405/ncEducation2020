package com.nc.autumn2020.lessons.lesson22.Task1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;


@Component
//@ConditionalOnProperty(prefix = "application", name = "ageLimit", havingValue = "+18", matchIfMissing = true)
@ConditionalOnProperty(value = "application.ageLimit", havingValue = "+18", matchIfMissing = true)

public class LoveRadio implements Radio{
    @Override
    public void play() {
        System.out.println("Вы слушаете Love Radio...");
    }
}
