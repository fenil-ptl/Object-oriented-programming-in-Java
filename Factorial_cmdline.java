// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/* Write a program to find the factorial of a given number. Take the number through the command line argument. */

public class Factorial_cmdline
{
    public static void main(String[] args) 
    {
        if (args.length == 0) 
        {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        int number = Integer.parseInt(args[0]);
        int factorial = 1;

        for (int i = 1; i <= number; i++) 
        {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}