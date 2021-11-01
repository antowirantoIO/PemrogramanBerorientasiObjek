import java.util.Scanner;

public class Pattern12
{
    public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to print the pattern ");

        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");

        for (int i = rows; i >= 1; i--)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 2; i <= rows; i++)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}