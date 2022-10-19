package java012_api;

import java.util.Scanner;

/*단입력:5
 * 5*1
 * 5*2=10
 * ...
 * 5*9=45
 * 계속하시겠습니까?(종료:n, 계속 아무키)n
 * 프로그램 종료
 * 
 */
public class Java143_scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) { //프로그램이 언제종료될지 모르는 예제일경우
		System.out.print("단입력 :");
		int dept = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d*%d=%d\n", dept, i, dept * i);

		}

		System.out.println("계속하시겠습니까?(종료:n, 계속 아무키)");
		String chk=sc.next();
		
		//문자열 비교할때에는 == 대신 .equals를 쓰기 ==넣으면 false임
		if(chk.equals("n")) {
			break;
		}
	}
			
		System.out.println("프로그램 종료");

	}
		
	
}