package javatutorial;

/**
 * @author unico
 * 
 */
public class Static {
	int Emp_Id;
	String Emp_Name;
	double Emp_Salary;
	static String Company = "UnicoSolution";

	Static(int Id, String Name, double Salary) {
		Emp_Id = Id;
		Emp_Name = Name;
		Emp_Salary = Salary;
	}

	void display() {
		System.out.println(Emp_Id + " " + Emp_Name + " " + Emp_Salary + " "
				+ Company);
	}

	public static void main(String[] args) {

	//	Company = "Punna Software Pvt.Ltd";
		Static s1 = new Static(01, "Vikas", 80000);
		Static s2 = new Static(02, "Guru", 70000);
		Static s3 = new Static(03, "Joel", 60000);
		Static s4 = new Static(04, "Dhamo", 50000);
		Static s5 = new Static(05, "Naveen", 40000);
		Static s6 = new Static(06, "Karthi", 30000);
		s1.display();
		
		System.out.println(Static.Company);
		s2.display();
		s3.display();
		s4.display();
		s5.display();
		s6.display();

	}

}