package java002_statements.prob;

public class Java036_do_while {

	public static void main(String[] args) {
		/*
		  do{
		  반복구행 문장;
		  }while(조건식); 
		 
		 */
	    char chk='y';
	    do {
	    	System.out.println("주문하시겠습니까?(y/n)");
	    } while(chk=='n');

	}

}
