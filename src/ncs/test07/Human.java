package ncs.test07;

public class Human  {
String name;
int age;
int height;
int weight;
public Human() {
	super();
}

public Human(String name, int age, int height, int weight) {
   super();
	this.name = name;
	this.age = age;
	this.height = height;
	this.weight = weight;
}
@Override
public String toString() {
	return String.format("%s %d %d %d",name,age,height,weight);
	
}
}

