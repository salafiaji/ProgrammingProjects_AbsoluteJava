package chapter1_Getting_Started;

public class RatArtificialSweetener_4 {

    public static final double AMOUNT_SWEETENER_DIET_SODA = 0.001;
    public static final double LETHAL_SWEETENER_AMOUNT_TO_RAT = 0.01;
    public static final double RAT_WEIGHT_KG = 0.5;
    public static final double DIETER_DESIRED_WEIGHT_KG = 70;

    public static void main(String[] args) {

        //Find ratio of sweetener to kill 0.5kg rat
        double lethalSweetenerPerkg = LETHAL_SWEETENER_AMOUNT_TO_RAT / RAT_WEIGHT_KG;

        //Calulates the amount lethal for desired weight
        double lethalAmountOfSweetenerForDesiredWeight = lethalSweetenerPerkg * DIETER_DESIRED_WEIGHT_KG;

        //calculates the amount of soda which the lethal amount for desired weight contains
        double lethalAmountOfDietSoda = lethalAmountOfSweetenerForDesiredWeight / AMOUNT_SWEETENER_DIET_SODA;

        System.out.println("Safe amount of soda pop that can be consumed is less than: " + lethalAmountOfDietSoda);
    }
}


