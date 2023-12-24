package ua.markevych.practice3;
//Вывести нечетное число
//Задача
//Из двух чисел с разной четностью вывести на экран нечетное число.

public class Task2 {
    public static void main(String[] args) {
        int x1 = 10;
        int x2 = 17;
        printOdd(x1, x2);
    }

    public static void printOdd(int y1, int y2) {
        if (y1 % 2 > 0) {
            System.out.println(y1);
        } else {
            System.out.println(y2);
        }
    }
}
