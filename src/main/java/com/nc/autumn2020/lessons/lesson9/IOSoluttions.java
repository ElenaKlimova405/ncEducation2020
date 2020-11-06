package com.nc.autumn2020.lessons.lesson9;

import com.nc.autumn2020.LessonApi;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class IOSoluttions implements LessonApi
{
    @Override
    public void executeSolution(String[] args) {
        // IO  NIIO

        //console


        // File

        // Nettwork




        // memory



        // byte


        // char

        fileWalker();
    }

    public void fileInputStream() {

        InputStream inputStream = null;
        OutputStream outputStream = null;



        try {
            inputStream = new FileInputStream("");
        } catch (Exception e) {

        }

    }

    public void consoleScanner() {
        double sum = 0;
        try (
                InputStream in = System.in;
            Scanner scanner = new Scanner(in);
        ) {
            while (scanner.hasNext()) {
                while (scanner.hasNextDouble()) {
                    sum += scanner.nextDouble();
                }
                if (scanner.hasNext())
                    scanner.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println(sum);
        }

    }


    public void fileWalker() {
        try {
            FileVisiterImpl fileVisiter = new FileVisiterImpl();
            Files.walkFileTree(Paths.get("").toAbsolutePath(), fileVisiter);
            System.out.println(fileVisiter.getMyOwnCounter());
            System.out.println(fileVisiter.getFiles());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
