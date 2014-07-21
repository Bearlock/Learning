import java.util.Scanner;

public class AddingValuesInALoop
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int input;
		int i = 0;

		System.out.println("I will add up the numbers you give me.");
		System.out.print("Number: ");
		input = keyboard.nextInt();		
		while (input != 0)
		{
			i += input;
			System.out.println("The total so far is " + i);

			System.out.print("Number: ");
			input = keyboard.nextInt();

		}

		System.out.println("\nThe total is " + i);
	}
}