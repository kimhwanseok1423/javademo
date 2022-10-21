package java017_collection;

import java.util.Vector;

public class Java178_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		// integer ->object: up-casting
		v.add(new Integer(10));
		v.add(new Integer(20));

		// int->Integer->object :auto boxing =>up-casting

		v.add(30);
		v.add(40);
		// string ->object:up-casting
		v.add(new String("java"));

		Integer it1 =(Integer)v.get(0);
		Integer it2=(Integer)v.get(1);
		Integer it3=(Integer)v.get(2);
		Integer it4=(Integer)v.get(3);
		String sn=(String)v.get(4);
		System.out.println(it1.intValue());
		System.out.println(it2.intValue());
		System.out.println(it3.intValue());
		System.out.println(it4.intValue());
		System.out.println(sn.toString() );
	

	
		
	}

}
