import java.util.Scanner;

public class Pattern11
{
    public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to print the pattern ");

        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i-1; j++)
            {
                System.out.print(" ");
            }
            // Print star in decreasing order
            for (int k = 1; k <= rows; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
        scanner.close();
    }
}