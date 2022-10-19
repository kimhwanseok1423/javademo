package java012_api;

import java.util.Scanner;

public class Java140_Scanner {
	public static void main(String[] args) {
		//콘슬창으로 데이터를 읽어오기 위해서 콘솔창과 연결
		Scanner sc=new Scanner(System.in);
		
		System.out.print("이름:");
		
		
		//String name=sc.next();//한단어
        String name=sc.nextLine(); //한 라인
		System.out.println(name);
	}

}
