package javatutorial.tut2;

public class Constructor {
	private String Name;

	public Constructor(String name) {
		Name = name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public void saying() {
		System.out.printf("Your name %s\n", getName());
	}

	public static void main(String args[]) {
		Constructor nameObject = new Constructor("ARUN");
		nameObject.saying();
	}
}