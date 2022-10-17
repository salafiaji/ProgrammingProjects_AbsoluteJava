package chapter1;

import static java.lang.Math.*;

public class BodyMassIndex {
    public static void main(String[] args) {
        double weightInKilogram = 6;
        double heightInMeters = 2;
        double bmi = weightInKilogram / pow(heightInMeters, 2.0);
        System.out.println(bmi);
    }

}
