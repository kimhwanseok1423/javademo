package java012_api;


/*
 * 정규화 표현식
 * 1.정규화 표현식이란 텍스트 데이터 중에서 원하는 조건과 일치하는 문자열을 찾아내기 위해
 *  사용하는 것으로 미리 정의된 기호와 문자를 이용해서 작성할 문자열을 말한다.
 * 
 * 
 * 
 */
public class Java124_RegEx {

	public static void main(String[] args) {
	String sn="java korea";
	String sg="";
	
	//a또는 r이면 '_'fh로 변경하기
	
for(int i=0;i<sn.length() ;i++) {
	char data=sn.charAt(i);
	if(data=='a'||data=='r') {
		sg+="_";
	}else {
		sg+=data;
	}
} System.out.println(sg);
//[]대괄호는 or를 의미한다.
//sn변수에 저장된 문자에서 a이거나 v이면 "_"로 변경한다.
System.out.println("Regular Expression을 이용한 문자 변경");
System.out.println(sn.replaceAll("[av]", "_"));

System.out.println(sn.matches(".*[ar].*"));
// . 은 임의의 문자 *은 여러개 
//sn변수에 저장된 문자열에서 a이거나 r이 포함되어있으면 true 아니면 false를 리턴

//sn변수 지정된 문자열에서 a이거나 r로 시작하면 true 아니면 false를 리턴
System.out.println(sn.matches("[ar].*"));

//sn변수 지정된 문자열에서 a이거나 r로 끝나면 true 아니면 false를 리턴
System.out.println(sn.matches(".*[ar]"));

//{2,3} : 2개에서 3개 까지의 공백을 "@"로 변경한다.

String st="java    korea";
String sa=st.replaceAll("\\s{2,3}", "@");
System.out.println(sa);
System.out.println(sa.length());
	}

}
