package java019_inner.part04OuterAnonymous;

public class Test extends InnerAnonymous{
@Override
void prn() {
	System.out.println(10);
}
};  //세미클론  필수
//익명클래스를 이용해서 할떄에는 만들면ㅁ서 한번만 만들수있지만 
// 상속클래스는 게속만들수있다는 다른점이있다.


public void display() {
	ta.prn();
}