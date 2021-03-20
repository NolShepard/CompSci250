/* <Noland Shepard>
* <nshepard@uwm.edu>
* CS 250 <201> Lab 803
*/

// import the Scanner class
import java.util.Scanner;

public class HoursWorked 
{

	public static void main(String[] args) 
	{
		// Create an input scanner for keyboard
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter the number of hours you worked this week : ");
		int hoursWork = stdIn.nextInt();
		System.out.print("Enter your hourly wage $ ");
		double payRate = stdIn.nextDouble();
		
		double regularPay = 0;
		double overTime = 0;
		
		if(hoursWork <= 40)
		{
			regularPay = hoursWork * payRate;
		}else if(hoursWork > 40)
		{
			regularPay = 40 * payRate;
			overTime = (hoursWork-40) * payRate * 1.5;
		}
		
		System.out.println();
		System.out.println(hoursWork + " hours of work at an hourly wage of $" + payRate + " results in :");
		System.out.println();
		System.out.println("$" + regularPay + " of regular pay");
		System.out.println();
		System.out.println("$" + overTime + " of overtime pay");
		
		stdIn.close(); // close scanner
	}

}
