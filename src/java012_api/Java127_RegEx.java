package java012_api;
/*[출력결과]
 * 851306-2689540 승인이 되었습니다.
 * 750625-16843 다시 입력하세요.
 * 
 * 
 * 
 * 
 * 
 */
public class Java127_RegEx {

	public static void main(String[] args) {
		System.out.println("851306-2689540");
		display(process("851306-2689540"));
		
		System.out.println("750625-16843");
		display(process("750625-16843"));

	}
public static boolean process(String sn) {
	//구현하시오
	
	return sn.matches("\\d{6}-\\d{7}");
}//end process

public static void display(boolean res) {
	if(res) {
		System.out.println("승인이 완료되었습니다.");
		}else {System.out.println("다시 입력하세요.");
	
	}
	
}//end display
}//end class
