package javatutorial.tut1;

import java.util.Scanner;

public class Kumar {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		Naveen nameObject = new Naveen ();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		nameObject.simpleMessage(name);

	}

}
