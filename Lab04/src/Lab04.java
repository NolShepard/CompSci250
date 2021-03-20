/* <Noland Shepard>
* <nshepard@uwm.edu>
* CS 250 <201> Lab 803
* Lab 04
*
* This program is designed to simulate as simple
* cash register for an office supply store. 
* Customers can buy pens and notebooks and will be charged
* tax at 5.5%.
*/

// import the Scanner class
import java.util.Scanner;

public class Lab04 
{

	public static void main(String[] args) 
	{
		//Create an input scanner for keyboard
		Scanner stdIn = new Scanner(System.in); 
		
		//Initializing input variables
		int pens;		
		int notebooks;		
		
		// Greet the customer and ask for input variables
		System.out.println("Welcome to Office Min" + "\n");
		System.out.print("How many Pens? ");
		pens = stdIn.nextInt();
		System.out.print("How many Notebooks? ");
		notebooks = stdIn.nextInt();
		
		//Initializing computation variables
		double taxRate = 0.055;
		double pensPrice = pens * 0.5;
		double notebooksPrice = notebooks * 1.0;
		double subTotal = pensPrice + notebooksPrice;
		double salesTax = subTotal * taxRate;
		double grandTotal = subTotal + salesTax;
		
		//Perform calculations and output results in proper format
		System.out.println("\n" + "Thank you, your bill is as follows ... " + "\n");
		System.out.println("Pens: $" + pensPrice);
		System.out.println("Notebooks: $" + notebooksPrice + "\n");
		System.out.println("Subtotal: $" + subTotal);
		System.out.println("Sales tax: $" + salesTax + "\n");
		System.out.println("Grand-Total: $" + grandTotal);

		stdIn.close(); // close scanner
	}

}
