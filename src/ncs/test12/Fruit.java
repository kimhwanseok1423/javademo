package ncs.test12;

public class Fruit {
	String name;
	int price;
	int quantity;
public Fruit() {}
public Fruit(String name, int price, int quantity) {
	super();
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}

@Override
public String toString() {
	return name+","+price+"원"+quantity+"개";
}
}
