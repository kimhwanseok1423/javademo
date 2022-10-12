package java001_basic;

public class Java009_operators {

	public static void main(String[] args) {
		int x=3;
		
		//전위 연산자
		++x; //x=x+1
		System.out.println(x);
		
		--x;
		System.out.println(x);

		
		int y=5;
		//후위 연산자
		y++;
		System.out.println(y);
		y--;
		System.out.println(y);
		
		//상수: 한번만 기억할수있는 메모리 공간
		final int NUM=4;
		//상수는 증감연산자를 사용할수없다.
		//NUM++;

	}

}
