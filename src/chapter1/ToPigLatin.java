package chapter1;
/**
Pig latin format transfers the first letter of a word to the end of the word.
 Adds the "ay" to the end of the word.
 The program changes the first letter of the word to uppercase.
*/

public class ToPigLatin {
    public static final String VOCALLIC_SYLLABLE = "ay";
    public static void main(String[] args) {
        // Names to be converted
        String first = "yemo";
        String last = "aji";

        //FirstName to PigLatin format
        String newFirstLetterToUppercase = first.substring(1, 2).toUpperCase(); // The second letter removing the first letter to the end
        String firstLetterToWordEnd = first.substring(0, 1); // the word after first letter removed
        String firstOtherLetters = first.substring(2); //The word after first letter removed

        //LastName to PigLatin format
        String newLastLetterToUppercase = last.substring(1, 2).toUpperCase(); // The second letter removing the first letter to the end
        String lastLetterToWordEnd = last.substring(0, 1); // the word after first letter removed
        String lastOtherLetters = last.substring(2); //The word after first letter removed


        String firstPigLatin = newFirstLetterToUppercase + firstOtherLetters + firstLetterToWordEnd + VOCALLIC_SYLLABLE;
        String lastPigLatin = newLastLetterToUppercase + lastOtherLetters + lastLetterToWordEnd + VOCALLIC_SYLLABLE;

        //Print fullname
        System.out.println("Fullname: " + firstPigLatin + " " + lastPigLatin);
    }
}
