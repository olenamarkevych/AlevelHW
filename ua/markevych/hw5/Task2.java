package ua.markevych.hw5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Collections;

//Перевірити заданий масив на впорядкованість за спаданням.
//*передати масив у метод, отримати boolean

public class Task2 {
    public static void main(String[] args) {
        int[] myArray = new int[20];
        fillArray(myArray);
        System.out.println(Arrays.toString(myArray));
        boolean sortArray = sortFall(myArray);
        System.out.println(sortArray);
    }

    //заповнення масива
    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 50);
        }
    }

    //сортування за спаданням і перевірка
    public static boolean sortFall(int[] fallen) {
        for (int i = 0; i < fallen.length; i++) {
            if (fallen[i] < fallen[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

