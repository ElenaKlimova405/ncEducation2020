package com.nc.autumn2020.lessons.lesson6;

import com.nc.autumn2020.LessonApi;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringLesson implements LessonApi {

    public void method() {


        // 1 нельзя
        String string1 = new String("some string 1");

        // 2 можно
        String string2 = "some string 2";

        // 3
        String[] example3 = {"a", "b", "c"};

        // 4
        char[] chars = {'a', 2, 3, 'c', 'd'};
        String string4 = String.valueOf(chars, 0, 3);


        // method split
        String someStringSplit = "a;b;c;j";
        String[] massStr = someStringSplit.split(";");

        // format
        String form = String.format("int value %20d \n", 10);
        System.out.println(form);

        // cats
        String[] cats = {"Vaska", "Murka", "Kotopes"};
        String result = "";

        for (int i=0; i<cats.length; i++) {
           result += cats[i];
            if (i != cats.length -1)
                result += ";";
        }

        System.out.println(result);

        StringJoiner stringJoiner = new StringJoiner("*");
        for (int i=0; i<cats.length;i++) {
            stringJoiner.add(cats[i]);
        }

        System.out.println(stringJoiner);


        // tokenaizer
        String stringTokenaizerExample = "a;b;c;f;r;s";
        StringTokenizer stringTokenizer = new StringTokenizer(stringTokenaizerExample, ";");

        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }




    }


    public void method2() {
        String url = "http://localhost.netcracker.com:6810/somproduct.plain_taskc.nc?" +
                "tab=_Task&object=9090363151013783084" +
                "&container=9158610804913819337" +
                "&task=9158610807913819337" +
                "&state=update&return=%2Fcommon%2Fuobject.jsp%3Fobject%3D9158610804913819337&object=9090363151013783084";
        try {
            String decodedUrl = URLDecoder.decode(url, "UTF-8");
            System.out.println(decodedUrl);

            String encodeUrlResult = URLEncoder.encode(decodedUrl,"ASCII");
            System.out.println(encodeUrlResult);
            String[] split = decodedUrl.split("\\?",2);
            split[1] = URLEncoder.encode(split[1],"ASCII");

            for (String s : split) {
                System.out.printf("result s = %s\n",s);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        /*
        UrlHolder instance = new UrlHolderFactory().createInstance(url);
        KeyValueParameter[] keyValueParameters = instance.getKeyValueParameters();
        for (KeyValueParameter keyValueParameter : keyValueParameters) {

            String result1 = new StringBuilder().append(keyValueParameter.getKey())
                    .append("=")
                    .append(keyValueParameter.getValue()).toString();

        }
        */
    }

    @Override
    public void executeSolution(String[] args) {
        this.method2();
    }
}
