package javatutorial;

/**
 * @author Naveen-Unico
 * 
 */
public class Helloworld {

	public void sample() // This Method or Function()
	{
		System.out.println("Welcome to Java World");
	}

	private void samptest() {
		System.out.println("It cannot be accessed another class");
	}

	/*protected void samp(int x)
	{
		x = 45;
		System.out.println("The variable value is " + x);
	}*/

	public static void main(String[] args) { // Main

		Helloworld objname = new Helloworld();
		objname.sample();
		objname.samptest();
	}

}
