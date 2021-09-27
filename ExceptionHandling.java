package com.company;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("hello");
        try {
            int x = 10 / 0;
            System.out.println(x);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Hi");
    }
}
