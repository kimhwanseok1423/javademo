package java012_api;
/*
 * JAVA API
 * Object
 * 클래스 중에서 최상으 ㅣ클래스이다
 * Object를 제외한 모든 클래스들은 OBject를 상속받고 있다.
 * java.lang 패키지에서 제공되는 클래스이다.
 * 
 * 
 * 
 */

public class Java114_Object {

	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.toString());

		int x = 5;
		int y = 5;
		System.out.printf("x=%d y=%d x==y:%b\n", x, y, x == y);

		Object ojt = new Object();
		System.out.printf("obj==ojt:%b\n", obj == ojt);

		System.out.printf("obj.equals(ojt):%b\n", obj.equals(ojt));

	}

}
