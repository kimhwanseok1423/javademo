package java004_array.prob;

public class Prob_01 {
	/*
	 * num배열에서 최대값을 출력하는 프로그램을 구현하시오.
	 * [출력결과]
	 * 최대값:95
	 */

	public static void main(String[] args) {

		int[] num = { 94, 85, 95, 88, 90 };
		int max=num[0];
		for(int i=0;i<num.length;i++) {
	        if(max<num[i]) {
	        	max=num[i];
	        }
			
		}System.out.println(max);
		
		//여기를 구현하세요.

	}// end main()

}// end class
