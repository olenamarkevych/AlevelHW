package ua.markevych.hw7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Vector {
    double x;
    double y;
    double z;


    // Constructor Declaration of Class
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    // метод обчислює довжину вектора
    public double lengthVector(double x, double y, double z) {
        double lengV = Math.abs(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
        return lengV;
    }

    //метод обчислює векторний добуток з іншим вектором
    public double dobutVector(double x1, double y1, double z1) {
        double dobut = x * x1 + y * y1 + z * z1;
        //  System.out.println("Довжина вектора =  " + lengV);
        return dobut;
    }

    //метод обчислює косинус кута між векторами
    public double cosVector(int x1, int y1, int z1) {
        double scal = x * x1 + y * y1 + z * z1;
        double v1 = Math.abs(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
        double v2 = Math.abs(Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2) + Math.pow(z1, 2)));
        double cosin = scal / (v1 * v2);
        return cosin;
    }

    //метод обчислює суму векторів
    public double[] sumVector(double x1, double y1, double z1) {
        double[] sum = new double[3];
        sum[0] = x + x1;
        sum[1] = y + y1;
        sum[2] = z + z1;
        return sum;
    }

    //метод обчислює  різницю векторів
    public double[] risnVector(double x1, double y1, double z1) {
        double[] risn = new double[3];
        risn[0] = x - x1;
        risn[1] = y - y1;
        risn[2] = z - z1;
        return risn;
    }

    //метод приймає ціле число N, та повертає масив випадкових
    //векторів розміром N
    public static int[] randomN(int n) {
        int[] randN1 = new int[n];
        fillArray(randN1);
        return randN1;
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 100);
            System.out.print(array[i] + " ");
        }
    }


    public static void main(String[] args) {
        Vector firstlengs = new Vector(2, 2, 2);
        Vector secondlengs = new Vector(2, 1, 3);
        System.out.println("Довжина вектора1 =  " + (firstlengs.lengthVector(1, 1, 1)));
        System.out.println("Довжина вектора2 =  " + (secondlengs.lengthVector(2, 1, 3)));
        Vector scaldob = new Vector(1, 1, 9);
        System.out.println("Добуток вектора1 = " + scaldob.dobutVector(2, 2, 2));
        System.out.println("Добуток вектора2 = " + firstlengs.dobutVector(2, 2, 2));
        System.out.println("Косінус кута = " + firstlengs.cosVector(2, 3, 1));
        System.out.println("Сума векторів = " + Arrays.toString(firstlengs.sumVector(2, 3, 1)));
        System.out.println("Різниця векторів = " + Arrays.toString(firstlengs.risnVector(2, 3, 1)));
        randomN(8);
    }
}

