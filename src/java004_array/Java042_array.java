package java004_array;

public class Java042_array {

	public static void main(String[] args) {
		/*
		 * 대문자 출력하는 프로그램 구현 [출력결과] 대문자 갯수:2
		 * 
		 */

		char[] data = new char[] { 'a', 'b', 'F', 'R', 'a' };
		int cnt = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] >= 'A' && data[i] <= 'Z') {
				cnt++;

			}
		}
		System.out.printf("대문자 갯수 : %d\n", cnt);

	}

}
