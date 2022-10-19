package java012_api;

/*1.기본자료형을 클래스로 정의해놓은 것을 Wraaper라한다.
 * char ->Character
 * byte ->Byte
 * short->Short
 * int ->Integer
 * long->Long
 * float->Float
 * double->Double
 * boolean->Boolean
 * 
 * 2.메모리에 저장된 값을 다룬 자료형으로 변환해주는 메소드를 제공하기 위해서 
 * Wrapper클래스를 제공한다.
 * 
 * auto boxing과 auto unboxing은 jdk5.0에서 추가된 기능이다.
 * auto boxing =>스택->힙영역에 복사
 * auto unboxing=> 힙=>스택영역에 복사
 
 */
public class Java144_Wrapper {
	public static void main(String[] args) {

		String data = "123";

		// Ingeger<-String
		Integer it = new Integer(data);

		// int <- Integer
		int num = it.intValue();
		System.out.println(num);
		// Ubteger <-String
		Integer ig = Integer.valueOf(data);
		int num2 = ig;

		double pro = it.doubleValue();
		System.out.println(pro);

		double pro2 = it;// auto unboxing

		// long <-Integer
		long nn = it.longValue();
		System.out.println(nn);
		long nn2 = it; // auto unboxing
		System.out.println(nn2);

		Double db = new Double(data);
		Double de = Double.valueOf(data);
		int x = de.intValue();
		System.out.println(x);
		// int x2=de;
		// System.out.println(x2);
		double y = de.doubleValue();
		System.out.println(y);
		double y2 = de;

		// int <-String
		int a = Integer.parseInt(data);
		System.out.println("a=" + a);

		// byte<-String
		byte b = Byte.parseByte(data);

		// double<-String
		double c = Double.parseDouble(data);
		System.out.println("c=" + c);

		boolean numBoolean = Boolean.parseBoolean(data);
		System.out.println("numBoolean:" + numBoolean);

		numBoolean = Boolean.parseBoolean("true");
		System.out.println("numBoolean:" + numBoolean);

		numBoolean = Boolean.parseBoolean("false");
		System.out.println("numBoolean:" + numBoolean);

		String ss = String.valueOf(1);
		System.out.println(ss);
		Double da = Double.valueOf("1");
		System.out.println(da);
		double dt = da;
		System.out.println(dt);
		
		int k=10;
		Integer in=new Integer(k);
		Integer is=k;
		System.out.println(is);
//////////////////////////////////////////////////////////////////////
		
		
		double dm=5.4;
		Double valDouble=dm;
		double dn=valDouble;
		
		String ko="90";
		Double dp=Double.valueOf(ko); //Double<= String
		String kt=dp.toString();//String <-double
		double kd=Double.parseDouble(ko);
		
	}
}
