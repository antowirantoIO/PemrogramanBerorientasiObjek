package javaClassApplication.master.main;

public class BicycleRegistration {
    public static void main(String[] args) {
        Bicycle bike1, bike2;
        String owner1, owner2;

        bike1 = new Bicycle();
        bike1.setOwnerName("Adam Smith");

        bike2 = new Bicycle();
        bike2.setOwnerName("Ben Jones");

        owner1 = bike1.getOwnerName();
        owner2 = bike2.getOwnerName();

        System.out.println(owner1 + " owns a bicycle");
        System.out.println(owner2 + " also owns a bicycle");
    }
}
