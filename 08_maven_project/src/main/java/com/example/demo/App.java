package com.example.demo;

import com.example.demo.utils.ConnectionUtils;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        System.out.println(ConnectionUtils.getMySqlConnection());
    }
}
