package com.company;
import java.util.Scanner;
import java.util.Random;
public class Application_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  name1, name2;
        System.out.println("Enter your Name : ");
        name1 = sc.next();
        System.out.println("Enter the name of your friend");
        name2 = sc.next();
        System.out.println("Hi " + name1 + " and " + name2);
        System.out.print("The friendship % is : ");
        Random ran = new Random();
        int num = ran.nextInt(100);
        System.out.print(num);
    }
}