package ua.markevych.hw5;

import java.util.Arrays;

//Заповнення двовимірного масиву значеннями індексу
//(від 1 і до кіл-ва елементів у масиві),
//при цьому кожен другий рядок -
//  від'ємними значеннями

public class Task1 {
    public static void main(String[] args) {
        int[][] indexArray = new int[5][3];
        fillArray(indexArray);
        System.out.println(Arrays.deepToString(indexArray));
        System.out.println();
    }
    //заповняємо масив
    public static void fillArray(int[][] array) {
        int sumMax = sumIndex(array);
        System.out.println(sumMax);
        int n = 1;
        int rows = array.length;
        int cols = array[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (n <= sumMax) {
                    array[i][j] = n;
                    n++;
                }
                if ((i + 1) % 2 == 0) {
                    array[i][j] = -array[i][j];
                }
            }
        }
    }
    //рахуємо кількість елементів в масиві
    public static int sumIndex(int[][] index) {
        int k = 0;
        for (int i = 0; i < index.length; i++) {
            for (int j = 0; j < index[0].length; j++) {
                k=k+1;
            }
        }
        return k;
    }
}



