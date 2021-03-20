/* <Noland Shepard>
* <nshepard@uwm.edu>
* CS 250 <201> Lab 803
* Program 3
*
* This program is designed to take input from the user on a pitcher's
* first and last name, number of earned runs, 
* number of innings pitched and output their ERA.
*/

// import the Scanner class
import java.util.Scanner;

public class eRACalculator 
{ // open class

	public static void main(String[] args) 
	{ // open main
		// Create an input scanner for keyboard
		Scanner stdIn = new Scanner(System.in);
		// initialize variables
		String firstName;
		String lastName;
		int earnedRuns;
		int inningsPitched;
		double eRA;		
		
		System.out.print("Pitcher's first name : "); // prompt user for information
		firstName = stdIn.next(); // store user input in variable
		System.out.print("Pitcher's last name : ");
		lastName = stdIn.next();
		System.out.print("Number of earned runs : ");
		earnedRuns = stdIn.nextInt();
		System.out.print("Number of innings pitched : ");
		inningsPitched = stdIn.nextInt();
		eRA = earnedRuns * 9.0 / inningsPitched; // perform calculation using user inputs to find ERA 
		System.out.println(firstName + " " + lastName + " has an ERA of " + eRA); // output results of calculation and user inputs
		
		stdIn.close(); // close scanner
	} // close main

} // close class
