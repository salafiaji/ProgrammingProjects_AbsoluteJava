package chapter2_Console_InputOutput;
/****************************************************************
Calculates the time taken by a car to travel a specified distance
****************************************************************/

public class TimeTakenByCar_4 {
    public static void main(String[] args) {
        //Declare variables
        int time;
        double remainderTime;
        int speed = 15; //miles per hour
        int distance = 55; //miles

        //The quotient from the division is the number of hours
        time = distance / speed ;

        //the remainder if used to calculate the number of minutes
        remainderTime = distance % speed; // hours
        System.out.println(remainderTime); //trace
        // convert remainderTime to time in minutes
        double timeInMinutes = (remainderTime / speed) * 60;

        //Print time Output in hours and minutes
        System.out.println("Time take = " + time + " hours " + timeInMinutes + " minutes. ");
    }
}
