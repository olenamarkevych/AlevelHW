package ua.markevych.hw6;

public class Phone {
    int number;
    String model;
    double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    void receiveCall(String name) {
        System.out.println("Вам дзвонить  " + name);
    }

    void getNumber() {
        System.out.println("Номер телефону   " + number);
    }


    public static void main(String[] args) {
        Phone phone;
        phone = new Phone();
        phone.number = 999999999;
        phone.model = "Samsung S22";
        phone.weight = 123.78;
        System.out.println(phone.number);
        System.out.println(phone.model);
        System.out.println(phone.weight);
        phone.receiveCall("Olena");
        phone.getNumber();
    }

    public class Phone2 {
        int number;
        String model;
        double weight;

        public Phone2(int number, String model, double weight) {
            this.number = number;
            this.model = model;
            this.weight = weight;
        }

        public Phone2(int number, String model) {
            this.number = number;
            this.model = model;
        }

        public Phone2() {

        }
    }

    public class Phone3 {
        int number;
        String model;
        double weight;

        public Phone3(int number, String model, double weight) {
            this.number = number;
            this.model = model;
            this.weight = weight;
        }

        public Phone3(int number, String model) {
            this.number = number;
            this.model = model;
        }

        public Phone3() {

        }
    }
}
