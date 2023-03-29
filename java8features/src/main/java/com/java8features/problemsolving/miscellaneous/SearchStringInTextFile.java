package com.java8features.problemsolving.miscellaneous;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SearchStringInTextFile {

    public static void main(String[] args) throws IOException {
        String s = Files.readString(Path.of("src/main/resources/zoom.txt"));
        System.out.println(s);

        if(s.contains("Aditya "))
        {
            System.out.println("true");
        }
    }
}
