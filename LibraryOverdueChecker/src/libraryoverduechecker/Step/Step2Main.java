/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryoverduechecker.Step;

import java.util.Calendar;
import java.util.GregorianCalendar;
import libraryoverduechecker.BookTracker;
import libraryoverduechecker.LibraryBook;

/**
 *
 * @author Anto Wiranto
 */
public class Step2Main {
    public static void main( String[] args ) {
        BookTracker bookTracker = new BookTracker();
        GregorianCalendar dueDate, returnDate;
        LibraryBook book;
        returnDate = new GregorianCalendar(2008, Calendar.MARCH, 15);
        
        System.out.println("Error: No books added. Return code - " + bookTracker.getCharge(returnDate));
        System.out.println("Output for empty book list:\n" + bookTracker.getList( ));
        
        System.out.println("\nAdding 20 books...\n");
        for (int i = 0; i < 20; i++) {
            dueDate = new GregorianCalendar(2008, Calendar.MARCH, i+1);
            book = new LibraryBook(dueDate);
            book.setTitle("Book Number " + (i+1));
            bookTracker.add(book);
        }
        System.out.println("Total Charge: $" + bookTracker.getCharge(returnDate));
        System.out.println("\n");
        System.out.println("List: \n" + bookTracker.getList());
    }
}
