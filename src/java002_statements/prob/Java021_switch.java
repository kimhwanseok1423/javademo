package java002_statements.prob;



/* Switch(식) 문에서 
 * 식의 결과 타입: byte short char int enum(jdk7) String(jdk7)
 



*/
public class Java021_switch {

	public static void main(String[] args) {
		int jumsu=40;
		switch(jumsu/10) {
		case 10 : 
			case 9:
				System.out.println('A'); break;
			case 8:
				System.out.println('B'); break;
			case 7:
				System.out.println('C'); break;
			case 6:
				System.out.println('D'); break;
			default:
				System.out.println('E'); break;
		}

	}

}
