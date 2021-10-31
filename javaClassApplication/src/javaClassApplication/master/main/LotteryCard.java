package javaClassApplication.master.main;

import java.util.Random;

public class LotteryCard {
    private static final int MAX_NUMBER = 15;
    //the smallest number on a card
    private static final int MIN_NUMBER = 10;
    //to represent a card before drawing
    private static final int NO_NUMBER = 0;
    //the 'largest' color for a card
    private static final int MAX_COLOR = 3;
    //the 'smallest' color for a card
    private static final int MIN_COLOR = 1;
    //to represent a card before drawing
    private static final int NO_COLOR = 0;
    //selected number on this card
    private int number;
    //selected color of this card
    private int color;

    private Random random;
    //Constructor
    public LotteryCard( ) {
        random = new Random( ) ;
        number = NO_NUMBER;
        color = NO_COLOR;
    }
    //spin the card
    public void spin( ) {
        number = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
        color = random.nextInt(MAX_COLOR - MIN_COLOR + 1) + MIN_COLOR;
    }
    //Returns the number on this card
    public int getNumber( ) {
        return number;
    }
    //Returns the color of this card
    public int getColor( ) {
        return color;
    }
}
