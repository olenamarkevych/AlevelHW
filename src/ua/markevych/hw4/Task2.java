package ua.markevych.hw4;
//Заповнити одновимірний масив випадковими цілими значеннями.
//Перевірити скільки простих чисел є у масиві. Розмір масиву – 1000 елементів.

import java.util.Random;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {
    public static void main(String[] args) {
        int[] myArray = new int[1000];
        fillArray(myArray);
        System.out.println();
        System.out.println(myArray.length);
        int count = simpleNumbers(myArray);
        System.out.println();
        System.out.println("Простих чисел = " + count);

    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1,1000);
           // System.out.print(array[i] + " ");

        }
    }

    public static int simpleNumbers(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            int n = 0;
            for (int j = 1; j <= numbers[i]; j++) {
                if (numbers[i] % j == 0) {
                    n = n + 1;
                }

            }
            if (n == 1 || n == 2) {
                count = count + 1;
                System.out.print(numbers[i] + " ");
            }
        }

        return count;
    }

}




