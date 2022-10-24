package java017_collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

/*
 * HashTable
 * 1.Map인터페이스 구현해놓은 좋은 클라스들은 key, value  쌍으로 저장한다.
 * 
 * 2.Map 인터페이스를 구현해놓은 클래스룸은 key이므로 key은 중복을 허용하지 않는다.
 */
public class Java194_Hashtable {
public static void main(String[] args) {
	Hashtable<Integer,String> table=new Hashtable<Integer, String>();
	table.put(10,"java");
	table.put(20,"jsp");
	table.put(30,"cema");
	table.put(20, "mysql");
	System.out.printf(table.get(10));
	System.out.println("===Enumeration==");
	Enumeration<String> enu=table.elements();
	//value 가져오기
	while(enu.hasMoreElements())
		System.out.println(enu.nextElement());
	Enumeration<Integer> enuKey=table.keys();
	//Key 가여오기
	while(enuKey.hasMoreElements()) {
		Integer key=enuKey.nextElement();
		System.out.printf("%d:%s \n",key,table.get(key));
		
		
		
	}System.out.println("-============================");
	Set<Integer> st=table.keySet();
	for(Integer key:st)
		System.out.printf("%d:%s\n",key,table.get(key));
 }
}
