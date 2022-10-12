package java006_class.prob;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */

public class Prob01_class {

	public static void main(String[] args) {
		//여기를 구현하세요.////////////////////	
Food f1=new Food();
f1.recp=10;
f1.display1();

Food f2=new Food();
f2.recd=2;
f2.display2();
		
	}//end main()

}//end class
