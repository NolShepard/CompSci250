/**
 * @author Noland Shepard
 * CS 250-201 Lab 803
 * Room dimensions calculator
 */
public class RoomDimensions 
{// Open class

	public static void main(String[] args) 
	{// Open main
		
		double roomLength = 20.5;
		double roomWidth = 12.0;
		double roomHeight = 10.75;
		String roomUnits = " feet";
		
		System.out.println("Given a length of " + roomLength + roomUnits);
		System.out.println("a width of " + roomWidth + roomUnits);
		System.out.println("and a height of " + roomHeight + roomUnits);
		System.out.println();
		System.out.println("The room's floor surface area is : " + (roomLength * roomWidth) + roomUnits + " squared.");
		System.out.println();
		System.out.println("The room's walls total surface area is : " + 
							(2 * roomHeight * roomWidth + 2 * roomHeight * roomLength) + roomUnits + " squared.");

	}// Close main

}// Close class
