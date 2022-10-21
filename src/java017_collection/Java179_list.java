package java017_collection;

public class Java179_list {
public static void main(String[] args) {
	UserList ulist=new UserList();
	ulist.add(10);
	ulist.add(20);
	ulist.add(30);
	ulist.add(40);
	System.out.println(ulist.size());
	
	Integer it1=(Integer)ulist.get(0);
	System.out.println(it1.intValue());
	
	try {
	System.out.println(ulist.get(0));
	System.out.println(ulist.get(1));
	System.out.println(ulist.get(2));
	System.out.println(ulist.get(3));
	System.out.println(ulist.get(4));
	} catch(ArrayIndexOutOfBoundsException ex) {
		System.out.println(ex.toString());
	}
	System.out.println(ulist.remove(1));
	System.out.println(ulist.size());
}
}
