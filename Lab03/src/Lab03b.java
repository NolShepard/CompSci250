// <Noland Shepard>
// <nshepard@uwm.edu>
// CS 250 <201> Lab 803
// Lab Exercise 3 part a

// This program is designed to take a Celsius temperature as input
// and output the equivalent Fahrenheit temperature.

// import the Scanner class
import java.util.Scanner;

public class Lab03b 
{ // open class
	public static void main(String[] args)
	{ // open main
		// Create an input scanner for keyboard
		Scanner stdIn = new Scanner(System.in);
		// Declare celsius variable
		double celsius;
		// Prompt for temperature in degrees Celsius.
		System.out.print("Enter temperature (degrees Celsius): ");
		// Get the celsius value from the user
		celsius = stdIn.nextDouble();
		// Declare fahrenheit variable and 
		// convert the Celsius temperature to Fahrenheit.
		double fahrenheit = celsius * 9.0/5.0 + 32;
		// Output the results of the conversion
		System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
		// Close the input scanner
		stdIn.close();
	} // close main
} // close class
