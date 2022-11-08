package chapter2_Console_InputOutput;

import java.util.Scanner;

public class WordChanger_9 {

    public static void main(String[] args) {

        //Input text
        System.out.println("Input sentence which includes the word hate");
        Scanner keyboard = new Scanner(System.in);
        String INPUT_TEXT = keyboard.nextLine();

        String text = "I have paraphrased the line to read:";
        String outputText = INPUT_TEXT.replaceFirst("hate", "love");

        System.out.println("The line of text to be changed is:");
        System.out.println(INPUT_TEXT);
        System.out.println(text);
        System.out.println(outputText);
    }
}
