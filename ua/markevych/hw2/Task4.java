package ua.markevych.hw2;

public class Task4 {
    public static void main(String[] args) {
        double x = -5;
        double y = 7;
        double x1 = -3;

        System.out.print("x= " + x + ", ");
        System.out.print("y= " + y + ", ");
        System.out.println("c= " + x1);

        //знаходження модулів чисел
        double xM =Math.abs(x);
        double yM =Math.abs(y);
        double x1M =Math.abs(x1);
        System.out.print("x= " + xM + ", ");
        System.out.print("y= " + yM + ", ");
        System.out.println("c= " + x1M);

        //знаходження мінімального числа
        double numberMin = Math.min (xM, yM);
       double numberMin1 = Math.min (numberMin, x1M);

       if (numberMin1 == xM) {
           System.out.println("Мінімальне за модулем число = " + x);
       }
        if (numberMin1 == yM) {
            System.out.println("Мінімальне за модулем число = " + y);
        }
        if (numberMin1 == x1M) {
            System.out.println("Мінімальне за модулем число = " + x1);
        }

    }
}
