package java006_class.part01;

public class Java065_class {
public static void main(String[] args) {
	Person ps;
	ps=new Person();
	ps.name="홍길동";
	ps.age=30;
	ps.gender='남';
	ps.develop();
	ps.run();
	
	System.out.printf("%s %d %c\n",ps.name,ps.age,ps.gender);
	
	Person pn=new Person();
	ps.name="이순신";
	ps.age=28;
	ps.gender='남';
	ps.develop();
	ps.run();
	System.out.printf("%s %d %c\n",ps.name,ps.age,ps.gender);
			
			
			
			
			
			
			
			
			
}
}
