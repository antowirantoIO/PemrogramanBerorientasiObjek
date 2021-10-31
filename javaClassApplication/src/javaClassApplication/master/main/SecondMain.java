package javaClassApplication.master.main;

public class SecondMain {
    public static void main(String[] args) {
        Bicycle bike;
        Account acct;

        String myName = "Jon Java";

        bike = new Bicycle();
        bike.setOwnerName(myName);

        acct = new Account();
        acct.setOwnerName(myName);
        acct.setInitialBalance(250.00);

        acct.add(25.00);
        acct.deduct(50);

        System.out.println(bike.getOwnerName() + " owns a bicycle and");
        System.out.println("has $" + acct.getCurrentBalance() + " left in the bank");
    }
}
