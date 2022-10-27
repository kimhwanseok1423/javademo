package ncs.test10;

public class Sales extends Employee implements Bonus {
public Sales() {}

public Sales(String name ,int number ,String department,int salary) {
	super(name,number,department,salary);
}

@Override
public void incentive(int pay) {
	int sum=(int)(getSalary()+pay*1.2);
	setSalary(sum);
	
}

@Override
public double tax() {
	// TODO Auto-generated method stub
	return super.getSalary()*0.13;
}





}
