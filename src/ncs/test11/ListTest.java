package ncs.test11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class ListTest {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		Random ran=new Random();
		for(int i=0;i<=10;i++) {
			list.add(ran.nextInt(100)+1);
		}
		
		System.out.println("정렬 전");
		display(list);
	System.out.println("정렬 후");
	list.sort(new Decending());
	System.out.println("정렬 후:");
	display(list);
	}
public static void display(List list) {
	System.out.println(list);
}
}
