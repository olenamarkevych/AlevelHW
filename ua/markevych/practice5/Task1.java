package ua.markevych.practice5;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        fillArray (numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void fillArray(int[] array) {
        for (int i=0; i<array.length;i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 50);
        }
    }
}
