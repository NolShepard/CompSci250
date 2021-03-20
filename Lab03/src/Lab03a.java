// <Noland Shepard>
// <nshepard@uwm.edu>
// CS 250 <201> Lab 803
// Lab Exercise 3 part a

// This program is designed to take a Fahrenheit temperature as input
// and output the equivalent Celsius temperature.

// import the Scanner class
import java.util.Scanner;

public class Lab03a 
{ // open class
	public static void main(String[] args)
	{ // open main
		// Create an input scanner for keyboard
		Scanner stdIn = new Scanner(System.in);
		// Declare fahrenheit variable
		double fahrenheit;
		// Prompt for temperature in degrees Fahrenheit.
		System.out.print("Enter temperature (degrees Fahrenheit): ");
		// Get the fahrenheit value from the user
		fahrenheit = stdIn.nextDouble();
		// Declare celsius variable and 
		// convert the Fahrenheit temperature to Celsius.
		double celsius = (fahrenheit - 32) * 5.0/9.0;
		// Output the results of the conversion
		System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
		// Close the input scanner
		stdIn.close();
	} // close main
} // close class
