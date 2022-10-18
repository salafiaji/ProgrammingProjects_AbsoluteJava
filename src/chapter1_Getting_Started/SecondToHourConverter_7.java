package chapter1_Getting_Started;

public class SecondToHourConverter_7 {
    public static final int INPUT_SECONDS = 50391;
    public static final int SECOND_PER_HOUR = 3600;
    public static final int SECOND_PER_MINUTE = 60;

    public static void main(String[] args) {
        int numberOfHours = INPUT_SECONDS / SECOND_PER_HOUR;

        //Calculate the number of minutes from the remainder of the number of hours
        int numberOfMinutes = (INPUT_SECONDS % SECOND_PER_HOUR) / SECOND_PER_MINUTE;

        //no of seconds from the remainder of number of minutes
        int numberOfSeconds = (INPUT_SECONDS % SECOND_PER_HOUR) % SECOND_PER_MINUTE;

        //Print output of hours, minutes and seconds
        System.out.println("The number of hours, minutes, seconds that corresponds to " + INPUT_SECONDS + " seconds is: ");
        System.out.println(numberOfHours + " hours, " + numberOfMinutes + " minutes, and " + numberOfSeconds + " seconds ");

    }
}
