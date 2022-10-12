package java006_class.part01;


/*
 [사각형 도형]
 가로 세로 색상 넓이 둘레
 5    3   레드 15 16
 7   4 블루 28 22 
  
객체의 특징: 가로 세로 색상
객체의 기능: 넓이를 구한다 둘레를 구한다.  
  
 
 */



public class Rect {
int width;
int height;
String color;
 void display() {
	 System.out.printf("%d,%d\n",width,height);	
}
}
