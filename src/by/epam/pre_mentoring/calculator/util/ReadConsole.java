package by.epam.pre_mentoring.calculator.util;

import java.util.Scanner;

public class ReadConsole {

    public int getX() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        while (!sc.hasNextInt()) {
            sc.next();
        }
        int x = sc.nextInt();
        return x;
    }


    public  int getY() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter second number:");
        while (!sc.hasNextInt()) {
            sc.next();
        }
        int y = sc.nextInt();
        return y;
    }

    public  char getChar() {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operator: +,-,*,/:");
        str = sc.nextLine();
        char ch = str.charAt(0);
        return ch;
    }

    public int getCheck() {

        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            sc.next();
        }
        int check = sc.nextInt();
        return check;
    }
}
