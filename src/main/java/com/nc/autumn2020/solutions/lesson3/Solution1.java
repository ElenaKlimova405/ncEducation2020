package com.nc.autumn2020.solutions.lesson3;


public class Solution1 {
    public void run(String[] args) {
        Book book = new Book.Builder("Title of the book", "Author of the book", 300)
                .price((short)120)
                .year(2020)
                .city("Moscow")
                .build();
        System.out.println(book);
    }
}

