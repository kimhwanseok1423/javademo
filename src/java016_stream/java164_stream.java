package java016_stream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class java164_stream {

	public static void main(String[] args) {
		//바이트 스트림    1번
		InputStream is =System.in;

		//바이트 스트림과 문자 스트림 연결   2번
		InputStreamReader ir=new InputStreamReader(is);
		
		
		
		//문자 스트림    3번 순
		BufferedReader br=new BufferedReader(ir);

		//이걸 간단하게 하는방법
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("x:");
		x=sc.nextInt();
		System.out.println("y:");
		y=sc.nextInt();
		System.out.printf("%d + %d=%d\n",x,y,x+y);
		sc.close();
		
		
	}

}
