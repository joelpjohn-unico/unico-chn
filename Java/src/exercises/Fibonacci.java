package exercises;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner fbs = new Scanner(System.in);
		
		System.out.print("enter n ");
		int n = fbs.nextInt();
		int count = 0;
		
		int a=0,b=1,c=1;
		
		while(count <= n)
		{
			c=a+b;
			System.out.print(c);
			a=b;
			b=c;
			
			count++;
		}
	}
}