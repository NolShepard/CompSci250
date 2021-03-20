/* <Noland Shepard>
 * <nshepard@uwm.edu>
 * CS 250 <201> Lab 803
 * 
 * Lab 5
 */
import java.util.Scanner;

public class Lab05
{
	public static void main(String[] args)
	{
	
		Scanner stdIn = new Scanner(System.in);
		//
		System.out.println("CS 201 Restaurant Guide\n");
		String response;
		char s, f;
		boolean spicy, fancy;
		// Ask user for his/her preference
		System.out.print("Do you like spicy food? (y / n) : ");
		// Get the next token
		response = stdIn.next();
		// Look only at first character
		s = response.charAt(0);
		if ( s == 'y' || s == 'Y' )
			spicy = true;
		else
			spicy = false;
		// Ask user for his/her preference
		System.out.print("Do you want to go to a fancy restaurant? (y / n) : ");
		// Get the next token
		response = stdIn.next();
		// Look only at first character
		f = response.charAt(0);
		fancy = (f == 'y') || (f == 'Y');
		// Make suggestion
		if (spicy)
		{
			if (fancy) 
			{
				System.out.println("I suggest you go to Thai Garden Palace.");
			}
			else 
			{
				System.out.println("I suggest you go to Alberto's Tacqueria.");
			}
		}
		else 
		{
			if (fancy) 
				{
				System.out.println("I suggest you go to Chez Paris.");
				}
			else 
			{
				System.out.println("I suggest you go to Joe's Diner.");
			}
		}
		
		
		stdIn.close();
	}
}