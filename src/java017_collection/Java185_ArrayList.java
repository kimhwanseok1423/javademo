package java017_collection;

import java.util.ArrayList;

public class Java185_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList=new ArrayList<String>();
		aList.add(new String("Java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		prnDisplay(aList);
		process(aList);
	}

	
	
	public static void prnDisplay(ArrayList<String> aList) {
		//aList매개변수의 요소에서 'j' Or 'J'가 포함되어있는 요소만 출력하는 프로그램을 구현하세요.
		for(String str:aList) {
			if(str.toLowerCase().contains("j"))
				System.out.println(str);
		}
	}
	
	
	public static void process(ArrayList<String> aList) {
		
			System.out.println(aList.contains("jsp")); //jsp가 포함되어있니? true값
	}
}
