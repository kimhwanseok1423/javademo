package java006_class.part06;

public class Java070_constructor {
public static void main(String[] args) {
	Handphone hp=new Handphone();
	hp.display();        
	
	Handphone hn=new Handphone("홍길동");
	hn.display();
	Handphone hr=new Handphone("홍길동","010-1234-5678");
	hr.display();
}
}
