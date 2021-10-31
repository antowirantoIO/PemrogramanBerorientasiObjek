package javaClassApplication.master.main;

import java.util.Random;

public class Die {
    private static final int MAX_NUMBER = 6;
    //the smallest number on a die
    private static final int MIN_NUMBER = 1;
    //To represent a die that is not yet rolled
    private static final int NO_NUMBER = 0;
    private int number;
    private Random random;

    //Constructor
    public Die() {
        random = new Random();
        number = NO_NUMBER;
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
