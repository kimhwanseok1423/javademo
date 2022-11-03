package java022_debug;

public class DebugTest01 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			System.out.printf("i=%d\n", i);
			sum = sum + count(i);
		}
		System.out.printf("sum=%d\n", sum);
	}

	public static int count(int index) {
		int[] num = new int[] { 1, 5, 2, 3, 4 };
		return num[index];
	}
}
/*
 * bug:어떤 의도하지 않는 문제가 발생한 오류 debug bug를 찾아 수정하는 작업 debugging bug을 원하는 대ㅗㄹ 실행이
 * 되도록 작업하는 과정 debugger debugging을할때 사용ㅇ하는 도구
 * 
 * 
 * 디버깅 종류 1.출력문을 이용한 디버깅 디버깅 툴을 이용한 디버깅
 */