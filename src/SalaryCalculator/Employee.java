package SalaryCalculator;

public class Employee {
	String name;
	int salary;
	int workHours;
	int hireYear;
	
	Employee(String name,int salary,int workHours,int hireYear){
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	void tax(){
		if(this.salary>1000) {
			salary=salary-salary*3/100;
		}
		
	}
	void bonus() {
		if(workHours>40) {
			salary=salary+(workHours-40)*30;
		}
		
	}
	void raiseSalary(){
		if(2024-hireYear<=9) {
			this.salary=salary*105/100;
		}
		else if(2024-hireYear>9&&2024-hireYear<=19) {
			this.salary=salary*110/100;
		}
		else if(2024-hireYear>19) {
			this.salary=salary*115/100;
		}
		
	}
	void printInfo() {
		System.out.println("Name:"+this.name+"-"+"Salary:"+this.salary+"-"+"WorkHours:"+this.workHours+"-"+"HireYear:"+this.hireYear);
		
	}
	

}
