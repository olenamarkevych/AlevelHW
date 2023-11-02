public class Task3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a + b;
        a = c - a;
        b = c - b;
        System.out.print("a = " + a + ", ");
        System.out.println("b = " + b);
    }
}
