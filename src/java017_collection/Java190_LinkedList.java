package java017_collection;

import java.util.LinkedList;

public class Java190_LinkedList {

	public static void main(String[] args) {
		/*
		 *  stack(스택)
		 *  1.LIFO(Last In First Out): 마지막에 저장된 요소를 먼저 꺼낸다
		 *  2.수식계산, 수식괄호 검사 ,undo/redo,뒤로 /앞으로 
		 */
		LinkedList<String> nStack=new LinkedList<String>();
		nStack.add(new String("java"));
		nStack.add(new String("jsp"));
		nStack.add(new String("spring"));
	
		while(!nStack.isEmpty())
			System.out.println(nStack.pop());
		
		

	}

}
