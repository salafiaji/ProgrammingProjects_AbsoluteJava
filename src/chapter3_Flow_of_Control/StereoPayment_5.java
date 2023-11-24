package chapter3_Flow_of_Control;

/*********************************************************************************************************
 * Question:
 * You have just purchased a stereo system that cost $1,000 on the following credit
 * plan: no down payment, an interest rate of 18% per year (and hence 1.5% per
 * month), and monthly payments of $50. The monthly payment of $50 is used to
 * pay the interest, and whatever is left is used to pay part of the remaining debt.
 * Hence, the first month you pay 1.5% of $1,000 in interest. That is $15 in interest.
 * So, the remaining $35 is deducted from your debt, which leaves you with a debt of
 * $965.00. The next month, you pay interest of 1.5% of $965.00, which is $14.48.
 * Hence, you can deduct $35.52 (which is $50 – $14.48) from the amount you owe.
 * Write a program that tells you how many months it will take you to pay off the
 * loan, as well as the total amount of interest paid over the life of the loan. Use a loop
 * to calculate the amount of interest and the size of the debt after each month. (Your
 * final program need not output the monthly amount of interest paid and remaining
 * debt, but you may want to write a preliminary version of the program that does output
 * these values.) Use a variable to count the number of loop iterations and hence,
 * the number of months until the debt is zero. You may want to use other variables as
 * well. The last payment may be less than $50 if the debt is small, but do not forget
 * the interest. If you owe $50, your monthly payment of $50 will not pay off your
 * debt, although it will come close. One month’s interest on $50 is only 75 cents.
 *********************************************************************************************************/
public class StereoPayment_5 {
    public static void main(String[] args) {
        int number_of_month = 0;
        double debt_on_stereo = 1000.0; // debt in dollars which is the price of stereo system
        double interest = 0.015; // 1.5%
        //double interestPaid = debt_on_stereo * interest;
        double cumulative_interestPaid = 0;

        while (debt_on_stereo > 0) {
            debt_on_stereo -= (50 - (debt_on_stereo * interest)); // cumulative reduction on the value of debt_on_stereo
            number_of_month++;
            double interestPaid = debt_on_stereo * interest;
            cumulative_interestPaid += interestPaid;
            //System.out.printf("Remaining debt after paying interest of %.2f in month %d is: %.2f\n",interestPaid, number_of_month, debt_on_stereo);
        }
        System.out.println("Number of months for repayment is: " + number_of_month);
        System.out.printf("Total amount of interest is: %.2f", cumulative_interestPaid);
    }
}
