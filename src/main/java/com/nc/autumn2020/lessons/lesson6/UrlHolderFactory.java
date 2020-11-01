package com.nc.autumn2020.lessons.lesson6;

public class UrlHolderFactory {

    public UrlHolderFactory() {

    }

    public UrlHolder createInstance(String url) {
        UrlHolder urlHolder = new UrlHolder();

        return urlHolder;
    }

    private void parse(String url, UrlHolder urlHolder) {
        //todo must be implemented as soon as possible
        urlHolder.setDomain("");
    }
}
