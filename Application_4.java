package com.company;
import java.util.*;
public class Application_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        output("*****ATM*****");
        System.out.print("Enter the username: ");
        String user_name = sc.nextLine();
        int first = 0;
        while(true) {
            if(first == 0) {
                System.out.print("Enter the password: ");
            }
            String password = sc.nextLine();
            if (password.equals("12345")) {
                int bal = 100000, with_draw, deposit;
                while (true) {
                    output("1.Deposit 2. Withdraw 3.Balance 4.Exit");
                    output("Enter your option");
                    int op = sc.nextInt();
                    if (op == 1) {
                        output("Enter the amount you want to deposit: ");
                        deposit = sc.nextInt();
                        bal = bal + deposit;
                    } else if (op == 2) {
                        output("Enter money to be withdrawn: ");
                        with_draw = sc.nextInt();
                        if (bal >= with_draw) {
                            output("collect your money");
                            bal -= with_draw;
                        } else {
                            output("Insufficient money:");
                        }
                    } else if (op == 3) {
                        System.out.println(bal);
                    } else {
                        System.exit(0);
                    }
                }
            } else {
                first = 1;
                output("Enter Correct Password");
            }
        }
    }
    static void output(String str) {
        System.out.println(str);
    }
}
