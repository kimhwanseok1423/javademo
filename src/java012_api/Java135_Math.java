package java012_api;
import static java.lang.Math.*;
public class Java135_Math {

	public static void main(String[] args) {
		double ran =random();
		System.out.println(ran);
		
		//0.0<=x<=9.999
		ran=ran*10;
		System.out.println(ran);

		//소수점 이하는 버림(0~9)리턴
		int num=(int)floor(ran); //round(ran),ceil(ran)
		System.out.println(num);
	}

}
