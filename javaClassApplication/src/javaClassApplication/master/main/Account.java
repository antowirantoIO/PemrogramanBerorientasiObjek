package javaClassApplication.master.main;

public class Account {
    private String ownerName;
    private double balance;

    public Account() {
        this.ownerName = "Unassignment";
        this.balance = 0.0;
    }

    public void add(double amt){
        balance += amt;
    }

    public void deduct(double amt){
        balance -= amt;
    }

    public double getCurrentBalance(){
        return balance;
    }


    public String getOwnerName() {
        return ownerName;
    }

    public void setInitialBalance(double bal){
        balance = bal;
    }

    public void setOwnerName(String name){
        ownerName = name;
    }
}
