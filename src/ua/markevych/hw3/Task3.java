package ua.markevych.hw3;

//Підрахувати кількість слів у рядку
// Вводиться рядок, що складається зі слів, розділених пробілами.
// Потрібно порахувати кількість слів у ньому

public class Task3 {
    public static void main(String[] args) {
        String text = "     It is a bad idea  to use a prefix to know the type of variable    ";
        System.out.println(text);
        countWords(text);
    }
    public static void countWords(String str){
        str = str.replaceAll("\\s+", " ");
        str = str.trim();
        int countWords = str.split("\\s").length;
        System.out.println("кількість слів  в рядку = " + countWords);
    }
}
