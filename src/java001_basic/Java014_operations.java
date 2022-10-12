package java001_basic;

public class Java014_operations {

	public static void main(String[] args) {
		/*
		  식 ? 참: 거짓
		 int res =식? 1:0;
		 char res=식?'a':'A';
		   */
		int total=23;
		int record=5;
		int res=total%record==0 ? total/record :total/record+1;
		System.out.println(res);
		
		
		
		
	}

}
