package ua.markevych.hw2;

public class Task2 {
    public static void main(String[] args) {
        int xa = 1;
        int ya = 5;
        int xb = 3;
        int yb = 5;
        int xc = 6;
        int yc = 7;
        double a, b, c;

        //функція обчислення довжини сторони

        a = Math.sqrt(Math.pow(xc-xb, 2) + Math.pow(yc-yb, 2));
        b = Math.sqrt(Math.pow(xa-xc, 2) + Math.pow(ya-yc, 2));
        c = Math.sqrt(Math.pow(xa-xb, 2) + Math.pow(ya-yb, 2));

      // знаходимо півпериметр
        double p = (a + b + c)/2;
       // знаходження площі трикутника
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Площа трикутника = " + s);

    }
}
