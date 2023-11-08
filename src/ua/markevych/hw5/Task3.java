package ua.markevych.hw5;

import java.util.Arrays;
//Даний двовимірний масив NxN(кількість рядків = кількість стовпців),
//  написати програму
//яка поміняє місцями стовпці та рядки.

public class Task3 {
    public static void main(String[] args) {
        int[][] change = {{2, 3, 5, 13}, {9, 6, 7, 11}, {1, 8, 13, 4}, {12, 25, 20, 23}};
        System.out.println("Вхідний масив : ");
        for (int i = 0; i < change.length; i++) {
            for (int j = 0; j < change[0].length; j++)
                System.out.print(change[i][j] + " ");
            System.out.println();
        }

        System.out.println("Змінений масив : ");
        int[][] change1 = changeRowColl(change);

        for (int i = 0; i < change1.length; i++) {
            for (int j = 0; j < change1[0].length; j++)
                System.out.print(change1[i][j] + " ");
            System.out.println();
        }
    }
// міняємо місцями стовпці і рядки
        public static int[][] changeRowColl ( int[][] mat){
            int r = mat.length;
            int c = mat[0].length;
            int[][] mat1 = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    mat1[i][j] = mat[j][i];
                }
            }
            return mat1;
        }
    }

