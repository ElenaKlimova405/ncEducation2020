package com.nc.autumn2020.solutions.additional;

import java.io.IOException;

public class Solution3 {
    public void run(String[] args) throws IOException {
        Decoder decoder = new Decoder.Builder("Климова Елена Вячеславовна.txt")
                .build();
        decoder.decode();
        System.out.println("Изображение сохранено!");
    }
}
