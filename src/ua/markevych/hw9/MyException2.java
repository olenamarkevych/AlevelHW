package ua.markevych.hw9;

public class MyException2 extends Exception {
    MyException2(double number) {
        super(String.valueOf(number));
    }
}

class MySqrt {
    public static double g(double number) throws MyException2 {
        double num = number;
        if (number < 0) {
            System.out.println("error");
            throw new MyException2(number);

        }
        System.out.println(number);
         num = Math.sqrt(number);
        return num;

    }

    public static void f(double number1) throws MyException2 {
        double num = g(number1);
        throw new MyException2(num);

    }

    public static void main(String[] args) throws MyException2 {
        try {
            f(8);
        } catch (MyException2 f) {
            System.out.println(f.getMessage());
        }
    }
}