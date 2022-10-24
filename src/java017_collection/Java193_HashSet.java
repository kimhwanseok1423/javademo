package java017_collection;

import java.util.HashSet;

//중복 허용안되고, 순서 유지 안된다.
public class Java193_HashSet {
	public static void main(String[] args) {
		HashSet<Integer> set =new HashSet<Integer>();
		set.add(new Integer(10));
		set.add(new Integer(30));
		set.add(new Integer(10));
		set.add(new Integer(20));
		
		for(Integer it :set)
		System.out.println(it);

	}
}
