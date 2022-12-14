package chapter4_Classes_I;

/**
 * Question 5
 * Define a class called WordCount whose objects count the number of words in a
 * sentence. An object of this class maintains a variable count that is a non-negative
 * integer. Include methods to set the counter to 0, to increase the count by 1, and to
 * decrease the count by 1 if any word encountered starts with ‘A’ or ‘a’. Be sure that
 * no method allows the value of the counter to become negative. Include an accessor
 * method that returns the current count value and a method that outputs the count
 * to the screen. There should be no input method or other mutator methods. The
 * only method that can set the counter is the one that sets it to 0. Write a program
 * (or programs) to test all the methods in your class definition.
 */
public class WordCount_5 {
    private String words;
    private int count;

    public static void main(String[] args) {
        WordCount_5 wordCount = new WordCount_5("Bakanji is");

        wordCount.displayCount(); //displays current value of count
        wordCount.decreaseCount(); //decreases count by 1 if the word begins with a or A
        wordCount.increaseCount(); //increases count by 1
        wordCount.setCount(); // sets count to zero
        wordCount.displayCount();
    }


    public WordCount_5(String words) {
        this.words = words;
        this.count = words.length();
    }

    public void setCount() {
        count = 0;
    }
    public void increaseCount() {
        count += 1;
        System.out.println("count increased by 1 and now count is " + count);
    }
    public void decreaseCount() {
        if (words.toLowerCase().charAt(0) == 'a' && count > 0) {
            count -= 1;
            System.out.println("after decrease by 1, count value is " + count);
        } else {
            System.out.println("Count can't be decreased cos sentence doesn't start with letter A ");
        }
    }
    public int getCount() {
        return count;
    }
    public void displayCount() {
        System.out.println("the current value of count is " + getCount());
    }

}
