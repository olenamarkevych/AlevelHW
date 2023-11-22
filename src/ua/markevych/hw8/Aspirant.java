package ua.markevych.hw8;

public class Aspirant extends Student {
    String firstName;
    String lastName;
    int group;
    String sincework;
    double averageMark;

    public Aspirant(String firstName, String lastName, int group, String sincework,double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.sincework = sincework;

    }

    public Aspirant() {
    }

    @Override
    public  String getScholarship(double averageMark) {
        String stipendia1 = "200 грн";
        String stipendia2 = "180 грн";

        if (averageMark == 5) {
            return stipendia1;
        }
        return stipendia2;
    }

}
