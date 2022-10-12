package java006_class.part06;

public class Handphone {

	/*생성자(constructor)
	 * 1.객채의 초기값 할당
	 * 2.생성자명은 클래스명하고 같다
	 * 3.생성자는 클래스에서 1개 이상 존재한다.
	 * 4.클래스에 정의된 생성자가 없으면 jvm에서 기본 생성자를 제공한다.
	 * 
	 * [기본생성자]
	 * 클래스의 접근제어자하고 같은 
	 * 
	 */
	//멤버변수
	String name;
	String number;
	
	
	//기본 생성자
	public Handphone() {}
	Handphone(String name){
		this.name=name;
	}
	
	
	
	Handphone(String name,String number){
		this.name=name;
		this.number=number;
		
		
		//메소드
	}
	void display() {
		System.out.printf("%s %s\n", name,number);
	}
	
	
	
	
}
  