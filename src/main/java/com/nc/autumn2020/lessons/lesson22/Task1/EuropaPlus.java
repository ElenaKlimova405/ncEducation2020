package com.nc.autumn2020.lessons.lesson22.Task1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;


@Component
@ConditionalOnProperty(prefix = "application", name = "ageLimit", havingValue = "+16", matchIfMissing = true)
public class EuropaPlus implements Radio{
    @Override
    public void play() {
        System.out.println("Вы слушаете Europa Plus...");
    }
}
