package com.company;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 111111111;
        int rem, sum = 0;
        while(n > 0) {
            rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
