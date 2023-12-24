package ua.markevych.practice3;
//Реалізувати метод пошуку індексу телефону в масиві, якщо телефону немає – повернути порожній
//Optional.

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class PhoneBook1 {
    private static final Map<String, Integer> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        phoneBook.put("016/161616", 0);
        phoneBook.put("016/161617", 1);
        phoneBook.put("016/161618", 2);
        Optional<Integer> index = findIndexByPhoneNumber("016/161618");
        if (index.isPresent()) {
            System.out.println("find index: " + index.get());
        } else {
            System.out.println("not find");
        }
    }

    public static Optional<Integer> findIndexByPhoneNumber(String phoneNumber) {
        return Optional.ofNullable(phoneBook.get(phoneNumber));
    }
}

