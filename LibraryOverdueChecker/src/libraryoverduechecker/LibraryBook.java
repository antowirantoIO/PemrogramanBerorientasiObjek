/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryoverduechecker;
import java.util.*;

/**
 *
 * @author Anto Wiranto
 */
public class LibraryBook {
    private static final double CHARGE_PER_DAY = 0.50;
    private static final double MAX_CHARGE = 50.00;
    private static final String DEFAULT_TITLE = "SAMPLE DEVELOPMENT";
    private static final double MILLISEC_TO_DAY = 1.0 / 1000 / 60 / 60 / 24;

    private GregorianCalendar dueDate;
    private String title;
    private double chargePerDay;
    private double maximumCharge;

    public LibraryBook(GregorianCalendar dueDate){
        this(dueDate, CHARGE_PER_DAY);
    }

    public LibraryBook(GregorianCalendar dueDate,
        double chargePerDay) {
        this(dueDate, chargePerDay, MAX_CHARGE);
    }

    public LibraryBook(GregorianCalendar dueDate, double chargePerDay, double maximumCharge) {
        this(dueDate, chargePerDay,
        maximumCharge, DEFAULT_TITLE);
    }

    public LibraryBook(GregorianCalendar dueDate, double chargePerDay, double maximumCharge, String title) {
        setDueDate(dueDate);
        setChargePerDay(chargePerDay);
        setMaximumCharge(maximumCharge);
        setTitle(title);
    }

    public double getChargePerDay( ) {
        return chargePerDay;
    }

    public GregorianCalendar getDueDate( ) {
        return dueDate;
    }

    public double getMaxCharge( ) {
        return maximumCharge;
    }

    public String getTitle( ) {
        return title;
    }

    public void setChargePerDay(double charge) {
        chargePerDay = charge;
    }

    public void setDueDate(GregorianCalendar date) {
        dueDate = date;
    }

    public void setMaximumCharge(double charge) {
        maximumCharge = charge;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString( ) {
        return String.format("%-30s $%5.2f $%7.2f %4$tm/%4$td/%4$ty", getTitle(), getChargePerDay(), getMaxCharge(), dueDate.getTime());
    }
    
    public double computeCharge( GregorianCalendar returnDate){
        double charge = 0.0;
        long dueTime = dueDate.getTimeInMillis();
        long returnTime = returnDate.getTimeInMillis();
        
        long diff = returnTime - dueTime;
        
        if (diff > 0) {
            charge = chargePerDay * diff * MILLISEC_TO_DAY;
            if (charge > maximumCharge) {
                charge = maximumCharge;
            }
        }
        return charge;
    }
}
