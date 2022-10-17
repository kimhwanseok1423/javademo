package java010_abstract_interface.part02;

public class Tri extends Shape {
public Tri() {
	
}

public Tri(int width,int height) {
	super(width,height);
}
@Override
	double getArea() {
		// TODO Auto-generated method stub
		return getWidth()*getHeight()/2;
	}
}
