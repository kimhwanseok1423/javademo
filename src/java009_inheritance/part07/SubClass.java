package java009_inheritance.part07;

public class SubClass extends SuperClass {



public SubClass() {
}

public SubClass(int a ,int b ,int c) {
	
	super(a,b,c);
	this.display();
	this.sumData();

	
	
	
}
public void sumData() {
	System.out.println("합:"+(x+y+z));
}
}