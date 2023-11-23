package chapter3_Flow_of_Control;

import java.util.Scanner;

/*********************************************************************************************************
 * The program calculates weight of a given mass on earth or moon
 *********************************************************************************************************/
public class BodyWeight {
    public static void main(String[] args) {
        double mass;
        double weight_on_moon, weight_on_earth;
        double gravitationalForceEarth = 9.81;
        double gravitationalForceMoon = gravitationalForceEarth / 6;
        int choice;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 1 to calculate weight on earth, 2 for moon and 0 to exit");
        choice = keyboard.nextInt();
        while (choice != 0) {
            if (choice == 1) {
                System.out.println("Enter mass of car in kg: ");
                mass = keyboard.nextDouble();
                weight_on_earth = mass * gravitationalForceEarth;
                System.out.printf("Weight on earth is: %.2f\n", weight_on_earth);
            } else if (choice == 2) {
                System.out.println("Enter mass of car in kg: ");
                mass = keyboard.nextDouble();
                weight_on_moon = mass * gravitationalForceMoon;
                System.out.printf("Weight on moon is: %.2f\n", weight_on_moon);
            }
            System.out.println("Enter 1 to calculate weight on earth, 2 for moon and 0 to exit");
            choice = keyboard.nextInt();
        }
    }
}
