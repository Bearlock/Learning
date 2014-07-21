import java.util.Scanner;

public class MoreUserInputOfData
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String firstName, lastName, login;
		int studentID, grade;
		double gpa;

		System.out.println( "Please enter the following information so I can sell it for a profit!");

		System.out.print( "First name: " );
		firstName = keyboard.next();

		System.out.print( "Last name: " );
		lastName =  keyboard.next();

		System.out.print( "Grade (9-12): " );
		grade = keyboard.nextInt();

		System.out.print( "Student ID: " );
		studentID = keyboard.nextInt();

		System.out.print( "Login: " );
		login = keyboard.next();

		System.out.print( "GPA (0.0-4.0): " );
		gpa = keyboard.nextDouble();

		System.out.println( "\nYour information: " );
		System.out.println("Login: " + login + "\nID: " + studentID + "	\nName: " + lastName + ", " + firstName + "	\nGPA: " + gpa + "	\nGrade: " + grade ); 

	}
}