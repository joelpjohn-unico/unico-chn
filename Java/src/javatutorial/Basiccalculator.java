package javatutorial;

import java.util.Scanner;

public class Basiccalculator {

	public static void main(String[] args) {
		Scanner naveen = new Scanner(System.in);
		int fnum, snum, answer;
		System.out.println("Enter first num: ");
		fnum = naveen.nextInt();
		System.out.println("Enter second num: ");
		snum = naveen.nextInt();
		answer = fnum + snum;
		System.out.println(answer);
	}

}
