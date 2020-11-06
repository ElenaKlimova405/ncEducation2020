package com.nc.autumn2020.lessons.lesson9;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public class FileVisiterImpl implements FileVisitor<Path> {
    private int myOwnCounter = 0;
    private String suffix = ".class";
    private ArrayList<String> files = new ArrayList<>();

    public int getMyOwnCounter() {
        return myOwnCounter;
    }

    public ArrayList<String> getFiles() {
        return files;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.printf("dir %s\n", dir.toString());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.printf("file %s\n", file.toFile().getAbsolutePath());
        if (file.toFile().getName().endsWith(suffix)) {
            myOwnCounter++;
            files.add(file.toFile().getAbsolutePath());
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }
}
