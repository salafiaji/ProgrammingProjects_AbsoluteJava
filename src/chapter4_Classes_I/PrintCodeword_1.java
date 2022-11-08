package chapter4_Classes_I;

public class PrintCodeword_1 {
    private int number;
    private char letter;
    int count = 0;

    public PrintCodeword_1(char letter, int number) {
        this.letter = letter;
        this.number = number;
    }

    public static void main(String[] args) {
        PrintCodeword_1 code = new PrintCodeword_1('D', 6);
        code.print_code();
    }

    public void print_code() {
        while (count != 26) {
            String codeword = Character.toString(letter) + number;
            System.out.println(codeword);

            if (letter != 'Z') {
                letter++;
            } else {
                letter = 'A';
            }

            if (number != 9) {
                number++;
            } else {
                number = 0;
            }
            count++;
        }
    }

}
