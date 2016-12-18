package exercises;

public class PrintAlphabets {

	public static void main(String args[]) {
		for (int i = 1; i < 27; i++) {
			int alphabets = 65;
			for (int j = 1; j <= i; j++) {
				System.out.print((char) alphabets);
				alphabets++;
			}
			System.out.println();
		}
	}
}
