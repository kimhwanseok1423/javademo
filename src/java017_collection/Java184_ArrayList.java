package java017_collection;

import java.util.ArrayList;

/*
 * vector와 Arraylist 사용방법은 거의 비슷함 큰차이는  동기화냐 비동기화냐 차이가있음
 * 
 * 1.Vector은 동기화 처리가 되어있고 ArrayList은 비동기화(계속 요청을 보낼수있음) 처리한다.
 * 2.Vector와 ArrayList은 메모리에 요소를 처리할때 배열의 구조를 따른다.
 * 3.Vector와 ArrayList의 클래스는 처리방법이 비슷하다.
 * 4..Vector와 ArrayList으로 수시로 요소의 삽입 삭제를 처리하는 것은 좋은 바업ㅂ이 아니다.
 * 
 * 
 * 
 */

public class Java184_ArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(10);// auto boxing->up casting
		aList.add(20);
		aList.add(30);
		
		for(int i=0;i<aList.size();i++)
			System.out.println(aList.get(i));
		
		for(Integer it:aList)
			System.out.println(it);
		System.out.println("===========================");
		System.out.println(aList.remove(0));
		
		System.out.println("===========================");
		for(Integer it:aList)
			System.out.println(it);
		System.out.println("===========================");
	}

}
