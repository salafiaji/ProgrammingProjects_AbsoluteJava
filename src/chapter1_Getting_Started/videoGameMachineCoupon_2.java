package chapter1_Getting_Started;

public class videoGameMachineCoupon_2 {
    // 10 coupons will get you 1 candybar
    // 3 coupons will get you 1 gumball
    public static final int COUPON_PER_CANDYBAR = 10;
    public static final int COUPON_PER_GUMBALL = 3;

    public static void main(String[] args) {
        int numberOfCouponWon = 27;
        int candyBarRedeemed = numberOfCouponWon  / COUPON_PER_CANDYBAR;

        //To determine how many gumballs can be got from what is left after collecting your preferred candybar

        int gumballRedeemed = (numberOfCouponWon % COUPON_PER_CANDYBAR) / COUPON_PER_GUMBALL;
        System.out.println("candyBarRedeemed: " + candyBarRedeemed);
        System.out.println("gumballRedeemed " + gumballRedeemed);

    }
}
