package ua.markevych.hw8;

import java.util.Arrays;

public class Student {
    String firstName;
    String lastName;
    int group;
    double averageMark;

    public Student(String firstName, String lastName, int group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student() {
    }

    public  String getScholarship(double averageMark) {
        String stipendia1 = "100 грн";
        String stipendia2 = "80 грн";
        if (averageMark == 5) {
            return stipendia1;
        }
        return stipendia2;
    }

    public  static void main(String[] args) {
        Student student;
        student = new Student();
        System.out.println("Стипендія студента: " + student.getScholarship(5));
        Student aspirant = new Aspirant();
        System.out.println("Стипендія аспіранта: " + aspirant.getScholarship(3.4));
        Student[] student1 = new Student[]{
               new Student("A", "A", 3, 5),
                new Aspirant("B", "B", 5, "C", 5)
        };
        System.out.println("Стипендія студента: " + student1[0].getScholarship(5));
        System.out.println("Стипендія аспіранта: " + student1[1].getScholarship(5));


    }
}

