/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryoverduechecker;

/**
 *
 * @author Anto Wiranto
 */
public class LibraryOverdueChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OverdueChecker overdue = new OverdueChecker();
        overdue.start();
    }
    
}
