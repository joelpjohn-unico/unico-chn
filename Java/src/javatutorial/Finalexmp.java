package javatutorial;

public class Finalexmp {

	int roll_no;
	String name;
	final String College = "KPEC";

	Finalexmp(int r, String n) {
		roll_no = r;
		name = n;
	}

	void display() {
		System.out.println(roll_no + "" + name + "" + College);
	}

	public static void mani(String ags[]) {

		Finalexmp f1 = new Finalexmp(1001, "Naveen");
		Finalexmp f2 = new Finalexmp(1002, "Kumar");
		f1.display();
		f2.display();

	}
}
