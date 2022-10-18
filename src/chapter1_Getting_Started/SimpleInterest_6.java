package chapter1_Getting_Started;

public class SimpleInterest_6 {
    public static void main(String[] args) {
        double princi_amnt = 1000;
        double int_rate = 0.05;
        double no_of_yrs = 5;
        double simpleInterest = (princi_amnt * int_rate * no_of_yrs) / 100;

        System.out.println("The simple interest: " + simpleInterest);

    }
}
