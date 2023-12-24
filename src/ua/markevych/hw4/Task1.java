package ua.markevych.hw4;
//Заповнити одновимірний масив випадковими цілими значеннями.
// Знайти середнє арифметичне та середнє геометричне елементів масиву. Розмір масиву -
//400 елементів.
//P.S. значення елементів можна обмежити значеннями 1-10 включно.

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] args) {
        int[] myArray = new int[400];
        fillArray(myArray);
        System.out.println();
        System.out.println(myArray.length);

        double seredAr = arithmetic(myArray);
        System.out.println("середнє аріфметичне = " + seredAr);
        double serGeom = geometric(myArray);
        System.out.println("середнє геометричне = " + serGeom);
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 10);
            System.out.print(array[i] + " ");
        }
    }

    public static double arithmetic(int[] arith) {
        double arSum = 0;
        for (int i = 0; i < arith.length; i++) {
            arSum = arSum + arith[i];
        }
        double resultAr = arSum / arith.length;
        return resultAr;

    }

    public static double geometric(int[] geom) {
        double geomSum = 1;
        double count = 0;
        for (int i = 0; i < geom.length; i++) {
            geomSum = geomSum * geom[i];
            count = count + 1;

        }
        double pows = 1 / count;
        double resultGeom = Math.pow(geomSum, pows);
        return resultGeom;

    }
}
