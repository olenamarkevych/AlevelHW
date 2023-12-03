package ua.markevych.hw10;

import java.util.ArrayList;
import java.util.Iterator;

//Напишіть Java-програму для обходу ArrayList з використанням:
//• циклу for,
//• for-each,
//• while,
//• ітератора
public class Task1 {
    public static void main(String[] args) {

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);

        for (int i = 0; i < myNumbers.size(); i++) {
            System.out.println( myNumbers.get(i));
        }
        System.out.println("=========================");

        for (int i : myNumbers) {
            System.out.println(i);
        }
        System.out.println("==========================");

        Iterator<Integer> it = myNumbers.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
