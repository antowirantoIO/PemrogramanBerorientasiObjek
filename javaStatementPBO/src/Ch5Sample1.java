import java.util.Scanner;

public class Ch5Sample1 {
    public static void main(String[] args) {
        double radius, circumference, area;

        Ch5Circle circle;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius : ");
        radius = scanner.nextDouble();

        circle = new Ch5Circle(radius);
        circumference = circle.getCircumference();
        area = circle.getArea();

        System.out.println("Input radius : " + radius);
        System.out.println("Circumference : " + circumference);
        if (circumference == Ch5Circle.INVALID_DIMENSION) {
            System.out.println("Cannot compute. Input invalid");
        } else {
            System.out.println(circumference);
        }
        System.out.println("Area : " + area);
    }
}
