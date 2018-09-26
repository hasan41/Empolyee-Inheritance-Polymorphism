
public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee L = new Lawyer();
		Employee SE = new SoftwareEngineer();
		Employee HL = new HarvardLawyer();
		
		printEmployee(L);
		System.out.println();
		printEmployee(SE);
		System.out.println();
		printEmployee(HL);
		System.out.println();

		
	}
	public static void printEmployee(Employee a) {
		System.out.println(a.getClass().getName());
		System.out.println("Salary: $" + ((Employee) a).getSalary());
		System.out.println("Hours: " + ((Employee) a).getHours());
		System.out.println("Vacation Days : " + ((Employee) a).getVacationDays());
		System.out.println("Vacation Form: " + ((Employee) a).getVacationForm());

		if(a instanceof SoftwareEngineer) {
			((SoftwareEngineer) a).writeCode();
		}
	}

}
