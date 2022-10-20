package java1020_practice;

/*
 * [출력결과]
 *  영어 소문자 갯수:3
 *  영어 대문자 갯수:3
 *  숫자 갯수:2
 */

public class Prob007_String {

	public static void main(String[] args) {
		String data = "ke4RdTA5";

		display(process(data));
	}// end main()

	public static char[] process(String data) {
int arr=0;
int brr=0;
		for(int i=0;i<data.length();i++) {
			if(data.charAt(i)>64 && data.charAt(i)<91) {
				arr++;
				
			}else if(data.charAt(i)>96 && data.charAt(i)<123) {
			   brr++;
			   
			}
	
}  
		return ;
	}// end process()

	public static void display(char[] arr) {
		
		
		
		
	}// end display()

}// end class
