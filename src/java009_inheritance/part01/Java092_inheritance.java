package java009_inheritance.part01;



/*
 상속: 기본 클래스가 가지고 있는 맴버들을 새로 만들 클래스에서 직접 만들지 않고 
      상속 받음으로써 새 클래스가 자신의 맴버처럼 사용할수있게 만든 기술이다.
      
       상속
       1. 기본 클래스를 재사용해서 새로운클래스를 정의하는것이다.
       2. 두 클래스를 조상과 자손 관계를 맺어준다.(extends)
       3. 상속을 해주는 클래스:super클래스 ,부모클래스,기본클래스 라고 말함
       4. 상속을 받는 클래스: 서브 클래스 ,자식클래스 ,유도클래스
       
       5.자식의 조상의 모든 자원을 상속받는다.(생성자,static{}은 제외)
       6.자식의 자원은 부모보다 크거나 같아야한다.
       7.상속을 할떄 사용되는 키워드:extends 
       클래스에서ㅏ 클래스를 사용할때 :단일상속
       인터페이스에서 인터페이스 상속: 다중 상속
       
       Class A{}
       Class B extends A{}
       
       Class 도형{}
       Class 삼각형 extends 도형{}
       
 
 */
public class Java092_inheritance {
public static void main(String[] args) {
	Child child=new Child();
	System.out.println("b="+ child.b);
	System.out.println("a="+child.b);
	child.display();
	child.toString();
	/* private 선언된 맴버변수는 상속해서 불러올수가없음 */
	
}
}
