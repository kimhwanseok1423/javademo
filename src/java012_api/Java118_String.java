package java012_api;

/*[출력결과]
 * ip:127.0.0.1
 * port:8000
 * 
 */
public class Java118_String {

	public static void main(String[] args) {
		String sn = "127.0.0.1:8000";
		System.out.printf("ip :%s\n", sn.substring(0, 9));
		System.out.printf("port :%s", sn.substring(10));
	}

}
