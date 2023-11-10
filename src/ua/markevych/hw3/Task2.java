package ua.markevych.hw3;

//Видалити з рядка пробіли і визначити, чи він є перевертнем (паліндромом)

public class Task2 {
    public static void main(String[] args) {
        String text = "  It is a bad idea to use a prefix to know the type of variable ";
        System.out.println(text);
        String strwithout = text.replace(" ", "");
        System.out.println(strwithout);
        boolean S = palindrom(strwithout);
        System.out.println(S);
    }
    public static String reversString(String str) {
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);
        }
        return str1;
    }

    public static boolean palindrom(String str) {
        String s = reversString(str);
        System.out.println(s);
        return (str.equals(s));
    }
}