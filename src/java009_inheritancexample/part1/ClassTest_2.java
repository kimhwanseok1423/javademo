package java009_inheritancexample.part1;

public class ClassTest_2 extends ClassTest_1 {
String department;

public  ClassTest_2() {
	
}

public ClassTest_2(String name,int salary,String department) {
	super(name,salary);
	this.department = department;
	
}

@Override
public void getInformation() {
	
	System.out.println("이름:" + getName() + " 연봉:" + getSalary()+" 부서:" +department);
}


@Override
public void prn() {
	System.out.println("서브클래스");
}

public void callSuperThis() {
	ClassTest_1 c1=new ClassTest_1();
	c1.prn();
	
	ClassTest_2 c2=new ClassTest_2();
	c2.prn();
}
}