package java007_class.part4;

public class Insurance {
String code;
	String type;
String name;
int payment;

public Insurance() {}

public Insurance(String code, String type, String name, int payment) {
	
	this.code = code;
	this.type = type;
	this.name = name;
	this.payment = payment;
}
public String toString() {
	return String.format("%s %s %s %d\n",code,name,type,payment);
}
}
