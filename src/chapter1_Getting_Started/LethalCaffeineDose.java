package chapter1_Getting_Started;

public class LethalCaffeineDose {
    public static final double LETHAL_CAFFEINE_DOSE = 10000;
    public static final double COFFEE_CUP_CAFFEINE_CONTENT = 160;
    public static final double COLA_CAN_CAFFEINE_CONTENT = 34;

    public static void main(String[] args) {

        //Output number of drinks it takes to kill a person
        double numberOfColaCan = LETHAL_CAFFEINE_DOSE / COLA_CAN_CAFFEINE_CONTENT;
        double numberOfCoffeeCups = LETHAL_CAFFEINE_DOSE / COFFEE_CUP_CAFFEINE_CONTENT;

        System.out.println("Number of coffee cups it tales to kill a person: " + numberOfCoffeeCups + " cups.");
        System.out.println("Number of cola cans it tales to kill a person: " + numberOfColaCan + " cans.");
    }
}
