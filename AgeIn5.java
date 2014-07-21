import java.util.Scanner;

public class AgeIn5
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		int baseAge;

		System.out.print("Hello. What is your name? ");
		name = keyboard.next();

		System.out.print("Hi, " + name + "! How old are you? " );
		baseAge = keyboard.nextInt();

		int ageMinusFive = baseAge - 5;
		int agePlusFive = baseAge + 5;

		System.out.println("Did you know that in five years you will be " + agePlusFive+ " years old?");
		System.out.println("And five years ago you were " + ageMinusFive + "! Imagine that!");
	}
}