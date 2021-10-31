package javaClassApplication.master.main;

public class RoomWinner {
    public static void main(String[] args) {
        LotteryCard one, two, three;
        one   = new LotteryCard( ) ;
        two   = new LotteryCard( ) ;
        three = new LotteryCard( ) ;
        one.spin();
        two.spin();
        three.spin();
        System.out.println("Winning Card Combination: ");
        System.out.println("1 - red; 2 - green; 3 - blue");
        System.out.println(" " );
        System.out.println("           color number");
        System.out.println("Card 1: " +   one.getColor( ) + "        " +   one.getNumber( )) ;
        System.out.println("Card 2: " +   two.getColor( ) + " " +   two.getNumber());
        System.out.println("Card 3:      " + three.getColor( ) + " " + three.getNumber());
    }
}
