package java002_statements.prob;

/*[문제]
 * data변수에 저장된 값이 대문자이면 "대문자입니다",소문자이면 "소문자입니다"
 * 기외에는 "기타입니다."로 출력하는 프로그램을 구현하세요
 * 
 * 
 * [출력결과]
 * data='D'  => D는 대문자입니다.
 * data='d'  => d는 소문자입니다.
 * data='1'  => 1는 기타입니다.
 */




public class Java020_if {

	public static void main(String[] args) {
		
		char data='Z';
		
	if(data>'a'&& data<'z') {
		System.out.printf("%c는 소문자입니다",data);
	}else if(data>'A' && data<'Z') {
		System.out.printf("%c는 대문자입니다",data);
	}else{System.out.printf("%c는 기타입니다",data);
	}

	}

}
