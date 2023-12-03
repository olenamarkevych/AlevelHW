package ua.markevych.hw10;

import java.util.*;

//Реалізувати утильний клас зі статичними методами:
// • getSum(List<Integer> numbers) – повертає суму елементів списку
// • getOddNumber(List<Integer> numbers) - повертає новий список непарних чисел
// • convertToStringList(List<Integer> numbers) – повертає новий список рядків
// • doubling(List<String> strings) – повертає новий список, у якому дублює
//     кожний рядок і конкатенує його

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        fillArray(numbers);
        System.out.println(numbers);
        System.out.println("Suma elementiv = " + getSum(numbers));
        System.out.println("Array OddNumbers: " + getOddNumber(numbers));
        System.out.println("Convert toString: " + convertToStringList(numbers));
        ArrayList<String> str = new ArrayList<>();
        str.add("Vo5");
        str.add("BM");
        str.add("F3");
        str.add("M7");
        System.out.println("Doubling string " + doubling(str));
    }

    public static void fillArray(List<Integer> numbers) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            numbers.add(random.nextInt(50));
        }
    }

    public static int getSum(List<Integer> numbers) {
        Integer sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    public static List<Integer> getOddNumber(List<Integer> numbers) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        int j = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                num.add(numbers.get(i));
                j++;
            }
        }
        return num;
    }

    public static List<String> convertToStringList(List<Integer> numbers) {
        ArrayList<String> str1 = new ArrayList<String>();
        int j = 0;
        for (int i = 0; i < numbers.size(); i++) {
            str1.add(String.valueOf(numbers.get(i)));
            j++;
        }
        return str1;
    }

    public static List<String> doubling(List<String> strings) {
        ArrayList<String> str = new ArrayList<String>();
        int j = 0;
        for (int i = 0; i < strings.size(); i++) {
            str.add(strings.get(i) + strings.get(i));
            j++;
        }
        return str;
    }
}


