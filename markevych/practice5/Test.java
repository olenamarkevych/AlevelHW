package ua.markevych.practice5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        fillArray(numbers);
        System.out.println("Convert toString: " + convertToStringList(numbers));
    }
    public static void fillArray(List<Integer> numbers) {
        Random random = new Random();
        for (int i = 0; i <10; i++) {
            numbers.add(random.nextInt(200));
        }
    }
    public static List<String> convertToStringList(List<Integer> numbers) {
        ArrayList<String> str1 = new ArrayList<String>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)>100) {
                str1.add(String.valueOf(numbers.get(i)));
            }
        }
        return str1;
    }
}
