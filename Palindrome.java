package com.company;

public class Palindrome {
    public static void main(String[] args) {
        int n = 121, r, rev = 0;
        int temp = n;
        while(n > 0) {
            r = n % 10;
            rev = (rev * 10) + r;
            n = n / 10;
        }
        if(temp == rev ) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
