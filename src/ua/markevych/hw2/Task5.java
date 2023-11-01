package ua.markevych.hw2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.print("Введіть  чиcло: ");

        int n = number.nextInt();
        int invNumber=0;
        do {
            invNumber = invNumber*10 +n % 10;
            n /= 10;
        } while (n!= 0);
        System.out.println("Число в зворотньому порядку: " + invNumber);
    }

}
