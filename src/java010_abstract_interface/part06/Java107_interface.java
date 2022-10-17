package java010_abstract_interface.part06;

public class Java107_interface {
public static void main(String[] args) {
	/*
	 * -(private)+(public) *(protected)
	 * class 와 interface를 이용하여 성적처리
	 * 
	 * 인터페이스명:Score
	 * +sol:int(초기값)
	 * +getScore():int
	 * 
	 * 인터페이스명":Print
	 * +toPaint():String
	 * 
	 * 클래스명:User
	 * -name:stirng
	 * +User(
	 * +User(name:string)
	 * toString():String
	 * 
	 * 클래스명:UserTest에 위에서  정의된 클래스 ,인터페이스 상속받음
	 * [출력화면]
	 * 이름:홍길동
	 * 점수:60점 
	 * 
	 * 
	 * 
	 */
	UserTest ut=new UserTest("홍길동",3);
	System.out.println(ut.toPaint());
}
}
