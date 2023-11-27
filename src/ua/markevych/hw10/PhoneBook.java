package ua.markevych.hw10;
//Реалізувати метод пошуку індексу телефону в масиві, якщо телефону немає – повернути порожній
//Optional.

import java.util.Objects;
import java.util.Optional;

class PhoneBook {
    private static final String[] PHONE_BOOK = new String[3];

    public static void main(String[] args) {
        PHONE_BOOK[0] = "016/161616";
        PHONE_BOOK[1] = "016/161617";
        PHONE_BOOK[2] = "016/161618";
        Optional<Integer> index = findIndexByPhoneNumber("016/1616162");
        if (index.isPresent()) {
            System.out.println(index.get());
        } else {
            System.out.println("not find");
        }
        System.out.println(findIndexByPhoneNumber("1"));
    }

    public static Optional<Integer> findIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < PHONE_BOOK.length; i++) {
            if (Objects.equals(PHONE_BOOK[i], phoneNumber)) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}

