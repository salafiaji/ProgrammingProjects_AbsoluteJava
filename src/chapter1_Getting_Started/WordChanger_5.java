package chapter1_Getting_Started;

public class WordChanger_5 {
    public static final String INPUT_TEXT = "I hate you.";

    public static void main(String[] args) {
        String text = "I have paraphrased the line to read:";
        String outputText = INPUT_TEXT.replaceFirst("hate", "love");

        System.out.println("The line of text to be changed is:");
        System.out.println(INPUT_TEXT);
        System.out.println(text);
        System.out.println(outputText);
    }
}
