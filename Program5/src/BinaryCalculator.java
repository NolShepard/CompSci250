/* <Noland Shepard>
 * <nshepard@uwm.edu>
 * CS 250 <201> Lab 803
 * 
 * Program 05
 * Simple binary calculator that calculates values based off user input
 */
import java.util.Scanner;

public class BinaryCalculator 
{

	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in); // scanner for keyboard input
		String bitString = "";
		int resultSoFar = 0;
		int userInput = -1; // force in value for loop
		
		while(userInput != 2)
		{
			userInput = -1; // force in value to prevent infinite looping
			System.out.println();
			System.out.println("---------------------------------------------");
			System.out.println("0 -> Shift Left, Add 0");
			System.out.println("1 -> Shift Left, Add 1");
			System.out.println("2 -> Exit, Evaluate");
			System.out.println("---------------------------------------------");
			
			while(userInput < 0 || userInput > 2)
			{
				System.out.print("Choose an operator from the menu above : ");
				userInput = stdIn.nextInt(); 
			}
			if(userInput == 0)
			{
				resultSoFar = 2 * resultSoFar + 0;
				bitString += userInput;
			}
			else if(userInput == 1) 
			{
				resultSoFar = 2 * resultSoFar + 1;
				bitString += userInput;
			} // omitted else because there is nothing to be done if userInput = 2 besides continuing
			
			
			System.out.println("---------------------------------------------");
			System.out.print(bitString);
		
		}
		
		System.out.println(" = " + resultSoFar); // Concatenates to bitString from end of first while loop
		System.out.println("---------------------------------------------");

		stdIn.close(); // closing scanner
	}

}
