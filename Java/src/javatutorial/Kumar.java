package javatutorial;

import java.util.Scanner;

public class Kumar {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		Naveen naveenObject = new Naveen ();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		naveenObject.simpleMessage(name);

	}

}
