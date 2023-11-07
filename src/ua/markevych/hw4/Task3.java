package ua.markevych.hw4;

//Заповнити одновимірний масив випадковими цілими значеннями.
//  Усі парні значення замінити на нулі. Розмір масиву – 2000 елементів.

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
    public static void main(String[] args) {
        int [] myArray = new int [2000];
        fillArray(myArray);
        System.out.println();
        System.out.println(myArray.length);
        System.out.println(Arrays.toString(myArray));
        int[] myArray1 = Arrays.copyOf(myArray, myArray.length);
        changeNumbers(myArray1);
        System.out.println(Arrays.toString(myArray1));
    }
    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1,1000);
        }
    }
    public static void changeNumbers (int [] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 == 0){
                numbers[i] = 0;
            }
        }
    }
}
