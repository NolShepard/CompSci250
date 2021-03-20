/* <Noland Shepard>
 * <nshepard@uwm.edu>
 * CS 250 <201> Lab 803
 * 
 * Program 4 
 * Compares a 4 character user input to determine if it is a valid double literal
 */

// import the Scanner class
import java.util.Scanner;

public class StringDouble 
{

	public static void main(String[] args) 
	{
		// Create an input scanner for keyboard
		Scanner stdIn = new Scanner(System.in);

		System.out.print("Please enter a valid (4 character) double literal : ");//user prompt
		String userDouble = stdIn.nextLine();//user input

		while(userDouble.length() != 4 || !(userDouble.contains(".")) || userDouble.indexOf('.') != userDouble.lastIndexOf('.'))//test for correct string length, that one is a '.', and that there is only one '.'
		{
			System.out.println(userDouble + " is a not valid (4 character) double literal");//return user's incorrect input
			System.out.println();
			System.out.print("Try again, Please enter a valid (4 character) double literal : ");//prompt user again
			userDouble = stdIn.nextLine();//user's new input
		}	

		if(Character.isDigit(userDouble.charAt(0)) == true || userDouble.charAt(0) == '.' || userDouble.charAt(0) == '+' || userDouble.charAt(0) == '-')//test for digit, '.', '-', or '+'
		{
			if(Character.isDigit(userDouble.charAt(1)) == true || userDouble.charAt(1) == '.')//test for digit or '.'
			{
				if(Character.isDigit(userDouble.charAt(2)) == true || userDouble.charAt(2) == '.')//test for digit or '.'
				{
					if(Character.isDigit(userDouble.charAt(3)) == true || userDouble.charAt(3) == '.')//test for digit or '.'
					{
						System.out.println(userDouble + " is a valid (4 character) double literal");
					} 
					else System.out.println(userDouble + " is not a valid (4 character) double literal");
				} 
				else System.out.println(userDouble + " is not a valid (4 character) double literal");
			} 
			else System.out.println(userDouble + " is not a valid (4 character) double literal");
		} 
		else System.out.println(userDouble + " is not a valid (4 character) double literal");

		stdIn.close(); // close scanner
	}

}