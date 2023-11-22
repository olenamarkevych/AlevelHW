package ua.markevych.hw8;

public interface Pow {
    int powNumber(int number, int pow);
}

class Power implements Pow {
    public int powNumber(int number, int pow) {
        int result = 1;
        for (int i = 1; i <= pow; i++) {
            result = result * number;
        }
        return result;
    }

    public static void main(String[] args) {
        Pow power = new Power();
        //System.out.println(power.powNumber(2, 3));
        Pow res = (number, pow) -> power.powNumber(number, pow);
        int r = res.powNumber(3, 2);
        System.out.println("Результат = " + r);
    }
}
