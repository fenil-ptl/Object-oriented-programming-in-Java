import java.util.Scanner;

class Scanner_use
{
	public static void main(String args[])
	{
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number 1 : ");		
		num1 = scan.nextInt();
		
		System.out.println("Enter number 2 : ");
		num2 = scan.nextInt();

		System.out.println("The subtraction of " + num1 + " from " + num2 + " is :  " + (num2 - num1));
	}
}