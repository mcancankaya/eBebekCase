package ebebekCase;

public class Main {

	public static void main(String[] args) {
		
		
		Employee[] employees = new Employee[]{
			new Employee("Metin", 1500, 50, 2010),
			new Employee("Kemal", 2000, 45, 1985),
			new Employee("Aysun",1000,35,2015)
		};
		for (Employee employee : employees) {
			System.out.println("------------------\n"+employee.toString());
		}
		
		
	}
	

}
