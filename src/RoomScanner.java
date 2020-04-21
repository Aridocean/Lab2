
import java.util.Scanner;

public class RoomScanner {

	public static void main(String[] args) {
		
		Scanner scnr= new Scanner(System.in);
		
		String getUserChoice;  //create string for Do While function under public class Room Detail if String == y it restarts main
		do {

			/*Calculate the are of classrooms
			 * Step 1 Ask the user to input the length and width of classroom
			 * Step 2 With those two inputs calculate the area and perimeter of the classrooms
			 * Step 3 Then ask if the user wants to continue measuring rooms. The code is found in the temperature conversion lab of workbook. 
			 * -allow acceptance of decimal entries.
			 */

			System.out.println(" Welcome to Grand Circus' Room Detail Generator!");

			System.out.print("Enter Length:");
			float lengthOfRoom = scnr.nextFloat();
			System.out.print("Enter Width:");
			float widthOfRoom = scnr.nextFloat();
			System.out.print("Enter Height:");
			float heightOfRoom = scnr.nextFloat();

			float areaOfRoom = widthOfRoom * lengthOfRoom;
			float perimeterOfRoom = (widthOfRoom * 2) + (lengthOfRoom *2);
			float volumeOfRoom = (widthOfRoom * lengthOfRoom * heightOfRoom);

			System.out.println("Area: " + areaOfRoom);
			System.out.println("Perimeter: " + perimeterOfRoom);
		    System.out.println("Volume: " + volumeOfRoom);

		System.out.print("Continue?(y/n):");

		getUserChoice = scnr.next(); }

		while (getUserChoice.equals("y"));
	}
}
