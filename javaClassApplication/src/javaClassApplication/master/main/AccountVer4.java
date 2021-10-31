package javaClassApplication.master.main;

public class AccountVer4 {
    private static final double FEE = 50;
    private static double balance;

    public void add(double amt) {
        adjust(amt);
    }
    //Deducts the passed amount from the balance
    public void deduct(double amt) {
        adjust( -(amt+FEE) ) ;
    }

    //Adjusts the account balance
    private void adjust(double adjustAmt) {
        balance = balance + adjustAmt;
    }
}
