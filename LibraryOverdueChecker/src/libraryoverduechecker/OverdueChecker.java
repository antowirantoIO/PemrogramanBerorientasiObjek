/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryoverduechecker;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Anto Wiranto
 */
public class OverdueChecker {
    private static enum Response {YES, NO}
    private static final String DATE_SEPARATOR = "/";
    private Scanner scanner;
    private BookTracker bookTracker;
    
    public OverdueChecker(){
        scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        bookTracker = new BookTracker();
    }
    
    public static void main(String[] args) {
        OverdueChecker checker = new OverdueChecker();
        checker.start();
    }
    
    public void start( ) {
        GregorianCalendar returnDate;
        
        String table;
        double charge;
        Response response;
        
        inputBooks();
        
        table = bookTracker.getList();
        System.out.println(table);
        System.out.println("\nNow check the over due charges...\n");
        do {
            returnDate = readDate("\nReturn Date: ");
            charge = bookTracker.getCharge(returnDate);
            displayTotalCharge(charge);
            response = prompt("\nRun Again (yes/no)? ");
        } while (response == Response.YES);
            System.out.println("\n\nThank you for using Library Overdue Checker");
    }
    
    private LibraryBook createBook(String title, double chargePerDay, double maxCharge, GregorianCalendar dueDate) {
        if (dueDate == null) {
            dueDate = new GregorianCalendar(); //set today as due date
        }
        LibraryBook book = new LibraryBook(dueDate);
        
        if (title.length() > 0) {
            book.setTitle(title);
        }
        if (chargePerDay > 0.0) {
            book.setChargePerDay(chargePerDay);
        }
        if (maxCharge > 0.0) {
            book.setMaximumCharge(maxCharge);
        }
        
        return book;
    }
    
    private void display(String text) {
        System.out.print(text);
    }
    
    private void displayTotalCharge(double charge) {
        System.out.format("\nTOTAL CHARGE:\t $%8.2f", charge);
    }
    
    private void inputBooks( ) {
        double chargePerDay, maxCharge;
        String title;
        GregorianCalendar dueDate;
        LibraryBook book;
        
        while (isContinue()) {
            System.out.println("\n");
            title = readString("Title : ");
            chargePerDay = readDouble("Charge per day: Rp.");
            maxCharge = readDouble("Maximum charge: Rp.");
            dueDate = readDate ("Due Date : ");
            
            book = createBook(title, chargePerDay, maxCharge, dueDate);
            bookTracker.add(book);
        }
    }
    
    private boolean isContinue( ) {
        Response response = prompt("\nMore books to enter (y/n)?");
        return (response == Response.YES);
    }
    
    private Response prompt(String question) {
        String input;
        Response response = Response.YES;
        
        System.out.print(question + " (Yes - y; No - n): ");
        input = scanner.nextLine();
        
        if (input.equals("Y") || input.equals("y")) {
            response = Response.YES;
        }
        
        return response;
    }
    
    private double readDouble(String prompt) {
        display(prompt);
        return scanner.nextDouble();
    }
    
    private float readFloat(String prompt) {
        display(prompt);
        return scanner.nextFloat();
    }
    
    private GregorianCalendar readDate(String prompt){
        GregorianCalendar cal;
        
        String yearStr, monthStr, dayStr, line;
        int sep1, sep2;
        
        display(prompt);
        line = scanner.nextLine();
        if(line.length() == 0){
            cal = null;
        } else {
            sep1 = line.indexOf(DATE_SEPARATOR);
            sep2 = line.lastIndexOf(DATE_SEPARATOR);
            
            monthStr = line.substring(0, sep1);
            dayStr = line.substring(sep1 + 1, sep2);
            yearStr = line.substring(sep2 + 1, line.length());
            
            cal = new GregorianCalendar(Integer.parseInt(yearStr), Integer.parseInt(monthStr)-1, Integer.parseInt(dayStr));
        }  
        
        return cal;
    }
    
    private String readString(String prompt) {
        display(prompt);
        return scanner.nextLine();
    }
}
