import java.util.Scanner;

public class CollatzSequence
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int userNumber, totalCount;
		int counter1 = 0;
		int counter2 = 0;
		int largestVal1 = 0;
		int largestVal2 = 0;
		int totalLargest = 0;

		System.out.print("Starting number: ");
		userNumber = keyboard.nextInt();
		while ( userNumber != 1 )
		{
			while ( userNumber % 2 == 0 && userNumber != 1 )
			{
				System.out.print( + userNumber + "\t");
				userNumber = userNumber / 2;
				counter1++;

				if( userNumber > largestVal1 )
				{
					largestVal1 = userNumber;
				}
			}

			while ( userNumber % 2 != 0 && userNumber != 1)
			{
				System.out.print( + userNumber + "\t");
				userNumber = 3 * userNumber + 1;
				counter2++;

				if ( userNumber > largestVal2 )
				{
					largestVal2 = userNumber;
				}
			}
		}
		if (largestVal1 > largestVal2)
		{
			totalLargest = largestVal1;
		}
		else
		{
			totalLargest = largestVal2;
		}

		System.out.print( +userNumber + "\t\n");
		totalCount = (counter1 + counter2);
		System.out.println("\nTerminated after " + totalCount + " steps. The largest value was " + totalLargest + ".");
	}
}