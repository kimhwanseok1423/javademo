package java009_inheritance.part08;

public class FireEngine extends Car {
private long water;

public FireEngine() {
	
}
public void setWater(long water) {
	this.water = water;
}
void waterSpread() {
	System.out.println(water+"물을 뿌린다.");
}

@Override
public String toString() {
	return String.format("차량의 색상: %s , 차량의속도: %d", color,getSpeed());
}

}
