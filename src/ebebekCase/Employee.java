package ebebekCase;

public class Employee {
	private String name; 
	private double salary; 
	private int workHours;
	private int hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax() {
		int taxAmount=3;
		double tax=0;
		if(salary>=1000) {
			tax = (salary*taxAmount)/100;
		}
		return tax;
	}
	
	public double bonus() {
		double bonusSalary=0;
		int bonusHour=0;
		
		bonusHour=this.workHours-40;
		
		if(bonusHour>0) {
			bonusSalary=bonusHour*30;
		}
		return bonusSalary;
	}
	
	public double raiseSalary() {
		int currentYear = 2021;
		int workYear =0;
		
		workYear=currentYear-this.getHireYear();
		
		if(workYear<10) {
			return (this.getSalary()*5)/100;
		}else if(workYear>9 && workYear<20) {
			return (this.getSalary()*10)/100;
		}else if(workYear>19) {
			return (this.getSalary()*15)/100;
		}else {
			return 0;
		}
	}
	
	public String toString() {
		String detail="Adı :"+this.getName()
		+"\nMaaş: "+this.getSalary()
		+"\nÇalışma Saati : "+this.getWorkHours()
		+"\nBaşlangıç Yılı : "+this.getHireYear()
		+"\nVergi :"+this.tax()
		+"\nBonus : "+this.bonus()
		+"\nMaaş Artışı : "+this.raiseSalary()
		+"\nVergi ve Bonuslarla birlikte Maaş : "+(this.getSalary()+this.bonus()-this.tax())
		+"\nToplam Maaş : "+(this.getSalary()+this.raiseSalary()+this.bonus()-this.tax());
		return detail;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

}
