package java010_abstract_interface.part01;


/*
 클래스 종류: 클래스,추상클래스, 인터페이스
 메소드 정의: 메소드 선언부+ 메소드 구현부
 public void prn(){}
 
  추상메소드: 선언부만 정의되 있는 메소드이다.
  abstract public void prn();
  
  추상클래스: 추상메소드를 가지고 있는 클래스 이다.
  abstract public class Test{}
  
  추상 클래스 목적(하는 이유) :추상메소드를 강제적으로 오버라이딩하고 객채 생성을 할 수있도록 하기 위해서
  
  
 
 */
public class Java102_abstract {

	public static void main(String[] args) {
		//CarAbs car=new CarAbs();//추상클래스는 객채생성을 할수가 없다.
		SenndaAbs sa=new SenndaAbs();
		sa.work();
		
		
		
		
		
	}

}
