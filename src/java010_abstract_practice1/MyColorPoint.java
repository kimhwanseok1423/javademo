package java010_abstract_practice1;

public class MyColorPoint extends MyPoint {
String color;
	public MyColorPoint() {};
	
	
	public MyColorPoint(int x ,int y , String color) {
		super(x,y);
		this.color=color;
	}
	@Override
	public void show() {
		System.out.println(y+","+x+","+color);
	}


	
	
}
