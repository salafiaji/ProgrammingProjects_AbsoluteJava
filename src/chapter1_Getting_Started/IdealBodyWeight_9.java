package chapter1_Getting_Started;

public class IdealBodyWeight_9 {
    public static final int BODY_WEIGHT_INPUT_IN_POUNDS = 110;
    public static final int BODY_HEIGHT_IN_FEET = 5;
    public static final int IDEAL_BODY_WEIGHT_PER_FEET = BODY_WEIGHT_INPUT_IN_POUNDS/ BODY_HEIGHT_IN_FEET;
    public static final int IDEAL_BODY_WEIGHT_PER_INCH = 5;

    public static void main(String[] args) {
        double heightInFeet = 6;
        double heightInInches = 3;

        double outputWeightForFeet = heightInFeet * IDEAL_BODY_WEIGHT_PER_FEET;
        double outputWeightForInch = heightInInches * IDEAL_BODY_WEIGHT_PER_INCH;
        double outputWeight = outputWeightForFeet + outputWeightForInch;
        System.out.println(outputWeight + " pounds");


    }
}
