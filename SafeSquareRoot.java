import java.util.Scanner;

public class SafeSquareRoot
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int userGuess = 0;

		System.out.println("SQUARE ROOT!");
		System.out.print("Enter a number: ");
		userGuess = keyboard.nextInt();

		while ( userGuess < 0) 
		{
			System.out.println("You can't take the square root of a negative number, silly");
			System.out.print("Try again: ");
			userGuess = keyboard.nextInt();
		}

		System.out.println("The square root of " + userGuess + " is " + Math.sqrt(userGuess) + ".");
	}
}