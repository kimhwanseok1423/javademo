package java002_statements.prob;

public class Java029_for {

	public static void main(String[] args) {
		int odd=0; //홀
		int even=0; //짝
		
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				even=even+i;
			}else {
				odd+=i;
			}
		}System.out.printf("홀수의 누적은 :%d\n",odd);
		System.out.printf("짝수의 누적은 :%d\n",even);
	}

}
