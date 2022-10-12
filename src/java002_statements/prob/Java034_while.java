package java002_statements.prob;


/*while(조건문)
반복 수행 문장
while문은 조건식을 생략할수없다.
*/
public class Java034_while {

	public static void main(String[] args) {
		
		int i=1;
		while(i<=5) {
			System.out.println(i++);
			i++;
		}
		//////////////////////////////////////////
		int y=0;
		while(y++<=5) {
			System.out.println(y);
		}
		

	}

}
