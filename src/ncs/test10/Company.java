package ncs.test10;

import java006_class.part08.Employees;

public class Company {
//name number department salary
	public static void main(String[] args) {
	Employee[] employees=new Employee[2];
	Secretary sc=new Secretary("Hilery",1,"secretary",800);
	employees[0]=sc;
	Sales sl=new Sales("Clinten",2,"sales",1200);
	employees[1]=sl;
	System.out.println("name\t department\t salary");
	for(int i = 0; i < employees.length; i++) {
		System.out.printf("%s\t%s\t%d\n", employees[i].getName(),employees[i].getDepartment(),
				employees[i].getSalary());
	

	}
	System.out.println("인센티브 100지급");	
	sc.incentive(100);
	sl.incentive(100);
	for(int i=0;i<employees.length;i++) {
		System.out.printf("%s\t%s\t%d\t%.1f\n",employees[i].getName(),employees[i].getDepartment(),employees[i].getSalary(),employees[i].tax());
	}
}
}
