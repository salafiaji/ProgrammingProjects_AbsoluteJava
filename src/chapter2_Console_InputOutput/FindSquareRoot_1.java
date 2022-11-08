package chapter2_Console_InputOutput;
/*
 * Calculates the square root of an input number using the babylonian algorithm
 */

import java.util.Scanner;

public class FindSquareRoot_1 {
    public static void main(String[] args) {

        // variables needed for the solution
        double n, guess, r;

        //Ask user to input a number
        Scanner keyboard = new Scanner(System.in);
        System.out.println("find square root of: ");

        //Store the number in a variable
        n = keyboard.nextDouble();

        //make a guess at the answer as n/2
        guess = n / 2;
        for (int count = 0; count < 5; count++) {
            r = n / guess;
            guess = (guess + r) / 2;
        }

        //Output answer to the user and round to two decimal places
        System.out.print("Square root of " + n + " = ");
        System.out.printf("%.2f %n", guess);
    }
}
