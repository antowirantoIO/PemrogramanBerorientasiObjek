import java.util.Scanner;

public class Pattern8
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows needed to print the pattern ");

        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");

        for (int i=1; i<=rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

        for (int i=1; i<=rows-1; i++)
        {
            for (int j = rows-1; j >= i; j--)
            {
                System.out.print(j);
            }
            for (int k = 1; k < i; k++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }
        scanner.close();
    }
}