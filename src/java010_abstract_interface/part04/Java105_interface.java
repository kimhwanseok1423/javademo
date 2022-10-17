package java010_abstract_interface.part04;


/*
 인터페이스
 1.추상메소드와 상수를 가지고 있는 형태이다.
 2.클래스 작성에 도움을 주기 위한 목적으로 제공되는 표준명세서이다.
 3.클래스에 인터페이스 구현할떄 사용되는 키워드이다.
 4. 인터페이스는 접근 페이지로 public만 제공
 5.인터페이스의 추상메소드에 abstract 키워드를 명시안해도됨
 6.모든 인터페이스의 메소드는 목시적으로 public abstract;
 7.멤버변수는 목시적으로 public static final이다.
 객채 생성은 하지 못하지만,참조형 타입ㅁ으로서 사용 가능하다.
 public static final in num=10;
 public abstract void prn();
             class    interface
     멤버변수     0          상수
     메소드    선언부+구현ㄴ부   선연부(추상메소드) 
     새엇ㅇ자      0          x
     초기화블록     0          x
     내부클래스     0          0        
     
     
     extends 클래스에 클래스 상속(단일 상속) 인터페이스에 인터페이스 다중상속
 */
public class Java105_interface {

	public static void main(String[] args) {
		
		
		System.out.println(CarRun.carCount);
		CarRun.Sun s=new CarRun.Sun();
		
		Truck tk=new Truck();
		tk.prn();
	}

}
