package com.nc.autumn2020.lessons.lesson6;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;

public class UrlHolderFactory {
    public UrlHolderFactory() {
    }

    public static UrlHolder createInstance(String url) {
        UrlHolder urlHolder = new UrlHolder();
        parse(url, urlHolder);
        return urlHolder;
    }

    private static void parse(String url, UrlHolder urlHolder) {
        try {
            String decodedUrl = URLDecoder.decode(url, "UTF-8");
            String[] split = decodedUrl.split("\\?");
            String[] splitFirstPart1 = split[0].split("://", 2);

            urlHolder.setProtocol(splitFirstPart1[0]);

            String[] splitFirstPart2 = splitFirstPart1[1].split("/",2);

            String[] domainAndPort = splitFirstPart2[0].split(":");
            if (domainAndPort.length > 0)
                urlHolder.setDomain(domainAndPort[0]);
            if (domainAndPort.length > 1)
                urlHolder.setPort(Integer.parseInt(domainAndPort[1]));

            if (splitFirstPart2.length > 1)
                urlHolder.setAddress(splitFirstPart2[1]);


            ArrayList<KeyValueParameter> keyValueParameters = new ArrayList<>();
            for (int i = 1; i < split.length; i++) {
                String[] keyAndValue = split[i].split("&");
                for (int j=0; j<keyAndValue.length; j++) {
                    String[] keyAndValueDivide = keyAndValue[j].split("=");

                    if (keyAndValueDivide.length > 1) {
                        KeyValueParameter keyValueParameter
                                = new KeyValueParameter(keyAndValueDivide[0], keyAndValueDivide[1]);
                        keyValueParameters.add(keyValueParameter);
                    }
                }
            }
            urlHolder.setKeyValueParameters(keyValueParameters);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}