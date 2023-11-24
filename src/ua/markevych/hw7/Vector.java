package ua.markevych.hw7;

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
    public Vector() {

    }


    // метод обчислює довжину вектора
    public double lengthVector() {
        double lengV = Math.abs(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
        return lengV;
    }

    //метод обчислює векторний добуток з іншим вектором
    public double dobutVector(Vector vector) {
        double dobut = x * vector.x + y * vector.y + z * vector.z;
        return dobut;
    }

    //метод обчислює косинус кута між векторами
    public double cosVector(Vector vector) {
        double scal = x * vector.x + y * vector.y + z * vector.z;
        double v1 = Math.abs(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
        double v2 = Math.abs(Math.sqrt(Math.pow(vector.x, 2) + Math.pow(vector.y, 2) + Math.pow(vector.z, 2)));
        double cosin = scal / (v1 * v2);
        return cosin;
    }
    //метод обчислює суму векторів
    public Vector sumvector(Vector vector) {
        Vector sum = new Vector();
        sum.x = x + vector.x;
        sum.y = y + vector.y;
        sum.z = z + vector.z;
        return sum;
    }

    //метод обчислює  різницю векторів
    public Vector risnVector(Vector vector) {
        Vector risn = new Vector();
        risn.x = x - vector.x;
        risn.y = y - vector.y;
        risn.z = z - vector.z;
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

    public void display() {
        System.out.println("Vector: (" + x + ", " + y + ", " + z + ")");
    }

    public static void main(String[] args) {
        Vector firstlengs = new Vector(2, 2, 2);
        Vector secondlengs = new Vector(2, 1, 3);
        System.out.println("Довжина вектора1 =  " + (firstlengs.lengthVector()));
        System.out.println("Довжина вектора2 =  " + (secondlengs.lengthVector()));
        System.out.println("Добуток ветора1 на вектор2 = " + firstlengs.dobutVector(secondlengs));
        System.out.println("Косінус кута = " + firstlengs.cosVector(secondlengs));
        Vector sum = firstlengs.sumvector(secondlengs);
        System.out.print("Сума векторів = ");
        sum.display();
        System.out.print("Різниця векторів = ");
        firstlengs.risnVector(secondlengs).display();
        randomN(8);
    }
}

