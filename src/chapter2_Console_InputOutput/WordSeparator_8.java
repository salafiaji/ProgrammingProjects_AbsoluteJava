package chapter2_Console_InputOutput;

import java.util.Scanner;

/*****************************************************************************************
The program separates a string of three words separated by comma into three separate words
*****************************************************************************************/

public class WordSeparator_8 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter(",");

        /*String word1, word2, word3;
        System.out.println("Enter a line of text");
        word1 = keyboard1.next();
        word2 = keyboard1.next();
        word3 = keyboard1.next();
        System.out.println("for keyboard1, the words read are: ");
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        //String junk = keyboard1.nextLine();
*/
        String word1;
        String word2;
        String word3;
        System.out.println("Input three words separated by a comma and end with a comma: ");

        word1 = keyboard.next();

        word2 = keyboard.next();

        word3 = keyboard.next();


        //Output words in different lines
        System.out.println("The words read are: ");
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

    }
}
