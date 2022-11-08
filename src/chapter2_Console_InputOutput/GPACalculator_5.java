package chapter2_Console_InputOutput;

import java.util.Scanner;

/******************************
* Calculate grade point average
*******************************/
public class GPACalculator_5 {

    public static void main(String[] args) {
        //Ask user for input and store in the variable
        System.out.println("Input your percentage score");
        int gpa;
        double percentage;
        Scanner keyboard = new Scanner(System.in);

        percentage = keyboard.nextInt();

        //Use formula to calculate GPA
        gpa = (int) ((percentage / 100) * 4);
        System.out.println("Your GPA is " + gpa);

    }
}
