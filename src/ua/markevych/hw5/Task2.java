package ua.markevych.hw5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Collections;

//Перевірити заданий масив на впорядкованість за спаданням.
//*передати масив у метод, отримати boolean

public class Task2 {
    public static void main(String[] args) {
        Integer[] myArray = new Integer[13];
        fillArray(myArray);
        System.out.println(Arrays.toString(myArray));
        Integer[] myArray1 = Arrays.copyOf(myArray, myArray.length);
        boolean eqArray = sortFall(myArray1);
        System.out.println(Arrays.toString(myArray1));
        System.out.println(eqArray);
    }

    //заповнення масива
    public static void fillArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 50);
        }
    }

    //сортування за спаданням і перевірка
    public static boolean sortFall(Integer[] fallen) {
        Arrays.sort(fallen, Collections.reverseOrder());
        for (int i = 0; i < fallen.length; i++) {
            if (fallen[i] > fallen[i + 1]) {
                return true;
            }
        }
        return false;
    }
}

