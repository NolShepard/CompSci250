/* <Noland Shepard>
 * <nshepard@uwm.edu>
 * CS 250 <201> Lab 803
 * 
 * quiz 4
 */
import java.util.Scanner;

public class Quiz04 
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int a, b;
		
		System.out.print("Please give two integers seperated by a space : ");
		a = stdIn.nextInt();
		b = stdIn.nextInt();
		
		int product = a * b;
		System.out.println("You entered " + a + " and " + b + ". Their product is " + product);
				
		stdIn.close();
	}
}
