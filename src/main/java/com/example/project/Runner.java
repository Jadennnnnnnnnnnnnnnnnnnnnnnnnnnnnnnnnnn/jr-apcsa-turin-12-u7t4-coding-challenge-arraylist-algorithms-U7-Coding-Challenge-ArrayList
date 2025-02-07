package com.example.project;
import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("hello", "my", "best", "friend", "whats", "up"));
        list = Main.duplicateUpperEnd(list);
        System.out.println(list);
    }
}