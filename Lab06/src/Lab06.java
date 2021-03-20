/* <Noland Shepard>
 * <nshepard@uwm.edu>
 * CS 250 <201> Lab 803
 * 
 * Lab 6
 */
import java.util.Scanner;

public class Lab06
{

	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("What kind of glasses would you like:");
		
		int glasses;
		int coating;
		double sum;
		
		do 
		{
			System.out.print("1 -> prescription, 2 -> non-prescription : ");
			glasses = stdIn.nextInt();
			
		} while(glasses < 1 || glasses > 2);
		
		if(glasses == 1) sum = 40;
		else sum = 25;		
		
		if(glasses == 1)
		{
			System.out.println("\nWhat kind of coating would you like:");
			
			do 
			{
				System.out.print("1 -> anti-glare, 2 -> brown tint : ");
				coating = stdIn.nextInt();

			} while(coating < 1 || coating > 2);
			
			if(coating == 1) sum += 12.5;
			else sum += 9.99;
		}		
		
		System.out.println("\nYour total cost is $" + sum);
		
		stdIn.close();

	}

}
