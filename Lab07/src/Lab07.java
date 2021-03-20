/* <Noland Shepard>
 * <nshepard@uwm.edu>
 * CS 250 <201> Lab 803
 * 
 * Lab 7
 */

// import the Scanner class
import java.util.Scanner;

public class Lab07 
{

	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int lines, spaces;
		String triangle = "";
		
		do 
		{
			System.out.print("Give an integer [1,9] : ");
			lines = stdIn.nextInt();
			
		}while(lines < 1 || lines > 9);
		
		for(int i = 1; i <= lines; ++i)
		{
			spaces = lines - i;
			for(int ii = 0; ii < spaces; ++ii)
			{
				System.out.print(" ");
			}
			triangle = i + triangle + i;
			System.out.print(triangle + "\n");
		}

		stdIn.close();
	}

}
