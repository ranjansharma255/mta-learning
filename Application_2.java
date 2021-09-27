package com.company;
import java.util.*;
public class Application_2 {
    public static void main(String[] args) {
        int[] cost = {10, 40, 50, 12};
        System.out.println("List of the items are ");
        System.out.println("1.Tea" + " " + "2.Maggie" + " " + "3.Chocolate" + " " + "4.Biscuit");
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String user_name = sc.next();
        int var;
        do {
            System.out.println("Enter the item which you want to purchase ");
            var = sc.nextInt();
            System.out.println("Welcome " + user_name);
            switch (var) {
                case 1:
                    System.out.println("You have selected Tea and cost is " + cost[0]);
                    break;
                case 2:
                    System.out.println("You have selected Maggie and cost is " + cost[1]);
                    break;
                case 3:
                    System.out.println("You have selected Chocolate and cost is " + cost[2]);
                    break;
                case 4:
                    System.out.println("You have selected Biscuit and cost is " + cost[3]);
                    break;
                default:
                    System.out.println("Please select and item");
            }
        } while(var < 4);
    }
}
