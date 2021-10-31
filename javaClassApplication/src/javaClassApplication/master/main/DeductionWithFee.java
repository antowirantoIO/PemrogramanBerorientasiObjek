package javaClassApplication.master.main;
import java.text.*;

public class DeductionWithFee {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        AccountVer3 acct;
        acct = new AccountVer3("Carl Smith", 50.00);
        acct.deduct(10);
        acct.deduct(10);
        acct.deduct(10);
        System.out.println("Owner: " + acct.getOwnerName());
        System.out.println("Bal  : $"
                + df.format(acct.getCurrentBalance()));
    }
}
