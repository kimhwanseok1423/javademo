package java009_inheritance.part05;

public class Java096_inheritance {
public static void main(String[] args) {
	/*
	 * 오버 라이딩
	 * 1.부모클래의 매소드 자식클래스에 재정의 하는 기능이다.
	 * 
	 * 오버라이딩 성립:
	 *   1) 부모클래스의 메소드가 자식클래스 메소드 이름을 동일해야한다
	 *  2)매개변수의 타입, 개수 ,순서가 일치해야한다.
	 *  3)리턴타입이 등록되어야한다.
	 *  4)접근제어자는 부모 클래스의 메소드와 같거나 더 넓은 범위여야한다.
	 *  private<defaul<protected<public
	 *  
	 *  
	 *  super 
	 *  1.자식클래스에서 조상클래스를 호출할떄 사용한다.
	 *  super.멤버변수
	 *  super.메소드
	 *  super()->생성자
	 *  
	 *  
	 *  
	 *  단일 클래스 vs 상속관계의 자식클래스
	 *  overloading vs overriding
	 *  this vs super
	 */
	
	Second sc=new Second();
	sc.display();
}
}
