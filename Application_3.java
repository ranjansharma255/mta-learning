package com.company;
import java.util.*;
public class Application_3 {
    public static void main(String[] args) {
        int[] cost = {10, 40, 50, 12};
        System.out.println("Menu");
        System.out.println("1.Tea" + " " + "2.Maggie" + " " + "3.Chocolate" + " " + "4.Biscuit" + " " + "5.Exit");
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String user_name = sc.nextLine();
        System.out.println("Welcome " + user_name);
        System.out.println("Enter the item which you want to purchase ");
        int var, total = 0;
        while(true){
            var = sc.nextInt();
            if(var == 1) {
                System.out.println("You have selected Tea and cost is " + cost[0]);
                total += cost[0];
            } else if( var == 2) {
                System.out.println("You have selected Maggie and cost is " + cost[1]);
                total += cost[1];
            } else if(var == 3 ) {
                System.out.println("You have selected Chocolate and cost is " + cost[2]);
                total += cost[2];
            } else if(var == 4) {
                System.out.println("You have selected Biscuit and cost is " + cost[3]);
                total += cost[3];
            } else if(var == 5) {
                System.out.println("Your Final bill is " + total);
                System.out.println("Thank You " + user_name + " 😎");
                break;
            }
            else {
                System.out.println("Please select and item");
            }
            System.out.println("Total cost is " + total);
        }
    }

}
