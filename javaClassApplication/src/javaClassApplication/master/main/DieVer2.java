package javaClassApplication.master.main;

import java.util.Random;

public class DieVer2 {
    private static final int MAX_NUMBER = 6;

    //the smallest number on a die
    private static final int MIN_NUMBER = 1;
    private int number;
    private Random random;

    //Constructor
    public DieVer2() {
        random = new Random();
        roll();
    }

    //Rolls the die
    public void roll() {
        number = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    }

    //Returns the number on this die
    public int getNumber() {
        return number;
    }
}
