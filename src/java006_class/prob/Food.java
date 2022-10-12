package java006_class.prob;

public class Food {
int recp; // 피자반지름
int recd; // 도넛 반지름

public Food() {}
public Food(int recp, int recd) {
	
	this.recp = recp;
	this.recd = recd;
}
public void display1() {
	System.out.printf("자바피자의 면적은 %3.1f\n",recp*recp*3.14);}
	public void display2() {
		System.out.printf("자바도넛의 면적은 %3.2f",recd*recd*3.14);
	}
	
}


