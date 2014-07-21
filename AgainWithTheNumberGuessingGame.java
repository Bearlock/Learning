import java.util.Scanner;
import java.util.Random;

public class AgainWithTheNumberGuessingGame
{
	public static void main( String [] args)
	{

	Scanner keyboard = new Scanner(System.in);
	int counter = 0;
	Random r = new Random();
	int guessNumber = 1 + r.nextInt(10);
	int theirGuess;

	System.out.println("I have chosen a number between 1 and 10. Try to guess it.");

		do
		{
			System.out.print("Your guess: ");
			theirGuess = keyboard.nextInt();
			counter++;
			if (theirGuess != guessNumber)
			{
				System.out.println("That is incorrect. Guess again.");
			}

		} while ( theirGuess != guessNumber );

	System.out.println("That's right! You're a good guesser.");
	System.out.println("It only took you " + counter + " tries.");

	}
}