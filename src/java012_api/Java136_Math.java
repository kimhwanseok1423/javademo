package java012_api;



/*
 *난수를 이용해서 소수점 첫번째자리까지 반올림해서 구하시오. 
 * ex)0.5689... ->5.7
 * 
 * 
 * 
 */
public class Java136_Math {

	public static void main(String[] args) {
		double ran=Math.random();
		
		ran=ran*10;
		System.out.println(String.format("%.1f",ran));
		
		double num=(double)ran/10;
		System.out.println(num);
		System.out.println((double)(Math.round(ran*10))/10);
		
	}
	
	
}
