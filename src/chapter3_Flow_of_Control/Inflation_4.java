package chapter3_Flow_of_Control;

import java.util.Scanner;


/*********************************************************************************************************
 * Question:
 * It is difficult to make a budget that spans several years, because prices are not stable.
 * If your company needs 200 pencils per year, you cannot simply use this year’s price
 * as the cost of pencils two years from now. Because of inflation, the cost is likely to
 * be higher than it is today. Write a program to gauge the expected cost of an item in
 * a specified number of years. The program asks for the cost of the item, the number
 * of years from now that the item will be purchased, and the rate of inflation. The
 * program then outputs the estimated cost of the item after the specified period.
 * Have the user enter the inflation rate as a percentage, such as 5.6 (percent). Your
 * program should then convert the percent to a fraction, such as 0.056 and should
 * use a loop to estimate the price adjusted for inflation.
 *********************************************************************************************************/

public class Inflation_4 {
    public static void main(String[] args) {
        double itemCost, inflationRate, inflationCost;
        int i, years;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input itemCost, inflation rate and year to calculate for:");
        itemCost = keyboard.nextDouble();
        inflationRate = keyboard.nextDouble();
        inflationRate = inflationRate / 100;
        years = keyboard.nextInt();
        System.out.printf("itemCost: %.2f\ninflationRate: %.4f\nyears: %d\n", itemCost, inflationRate, years);
        for (i = 1; i <= years; i++) {
            inflationCost = (inflationRate + 100) * itemCost * i;
            System.out.printf("Cost after year %d of inflation is: %.2f\n", i, inflationCost);
        }
    }
}
