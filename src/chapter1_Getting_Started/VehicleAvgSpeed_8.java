package chapter1_Getting_Started;

public class VehicleAvgSpeed_8 {
    public static final double DISTANCE = 180;

    public static void main(String[] args) {

        // This program calculates vehicle average speed given a time and distance travelled

        double time = 20.5;
        double avgSpeed = DISTANCE / time;

        System.out.println("Car average speed is " + avgSpeed + " miles per hour");

    }
}
