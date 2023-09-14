import java.util.Scanner;

// Khari Griffin-Boyd 2-27-22
public class Week2input {
// Calculate the width of a rectangle
	public static void main(String[] args) {
		
		int perimeter;
		
		int length;
		
		int width;
		
		int two = 2;
		
		Scanner scan = new Scanner(System.in);
		//Ask for input from user
		System.out.println("Please enter the perimeter of the rectangle ");
		perimeter = scan.nextInt();
		
		System.out.println("Please enter the length of the rectangle ");
		length = scan.nextInt();
		
		//form the width equation
		width = (int) ((perimeter / two) - length);
		
		System.out.println("The width of the rectangle is: " + width);
		//print the width to the user
		

	}

}
