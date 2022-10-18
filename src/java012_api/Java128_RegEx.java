package java012_api;

import java.util.regex.Pattern;
//regular expression 홈페이지 들어가면서 복습해보기
/*아이디를 입력할때 영문자,숫자 조합으로 합니다. 최소 5자이상 10자이하까지만 가능합니다.
 * (반드시 영문자로 시작한다.)
 * [출력결과]
 * 로그인되었습니다
 * 회원이 아닙니다.
 * 
 * 
 */
public class Java128_RegEx {

	public static void main(String[] args) {
	System.out.println("ymy232");
	display(process("y23m1"));
	
	System.out.println("korea");
	display(process("korea"));
		

	}//end main

	public static boolean process(String sn) {
		//구현하시오!
		return  sn.matches("[a-zA-Z][a-zA-Z0-9]{4,9}")&& Pattern.compile("\\d").matcher(sn).find();
	}//end process
	
	public static void display(boolean res) {
		if(res) {
			System.out.println("로그인 되었습니다.");
		
		}else {System.out.println("회원이 아닙니다.");
	}
	}
}
