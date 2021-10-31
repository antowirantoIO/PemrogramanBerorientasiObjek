package javaClassApplication.master.main;

public class AccountVer3 {
    private static final double FEE = 0.50;
    private String ownerName;
    private double balance;
    //Constructor
    public AccountVer3(String name, double startingBalance) {
        ownerName = name;
        balance = startingBalance;
    }
    //Deducts the passed amount from the balance
    public void deduct(double amt) {
        balance = balance - amt - FEE;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getCurrentBalance() {
        return balance;
    }
}
