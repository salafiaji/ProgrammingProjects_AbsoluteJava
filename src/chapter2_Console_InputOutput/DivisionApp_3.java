package chapter2_Console_InputOutput;

import java.util.Scanner;

/***********************************************************************************************
* Divides two inputs with each other and outputs the dividend, divisor, remainder and quotient
*************************************************************************************************/

public class DivisionApp_3 {
    public static void main(String[] args) {
        //declare two variables
        int firstNum, secondNum, remainder, quotient;

        //Ask user for input
        System.out.println("Input two numbers: ");
        Scanner keyboard = new Scanner(System.in);

        //Store the numbers in the declared variables
        firstNum = keyboard.nextInt();
        secondNum = keyboard.nextInt();

        //Evaluate the division and remainder
        quotient = firstNum / secondNum;
        remainder = firstNum % secondNum;

        //Print out the dividend,divisor, quotient and remainder
        System.out.println("Dividend is " + firstNum);
        System.out.println("Divisor is " + secondNum);
        System.out.println("The division between the two numbers yields a quotient of " + quotient);
        System.out.println("and a remainder of " + remainder);
    }

}
