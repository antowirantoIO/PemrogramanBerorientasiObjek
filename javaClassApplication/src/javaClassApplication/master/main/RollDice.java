package javaClassApplication.master.main;

public class RollDice {
    public static void main(String[] args) {
        Die one, two, three;
        one   = new Die( ) ;
        two   = new Die( ) ;
        three = new Die( ) ;
        one.roll();
        two.roll();
        three.roll();
        System.out.println("Results are " + one.getNumber( ) + " " +
                two.getNumber( ) + " " +
                three.getNumber( ) ) ;
    }
}
