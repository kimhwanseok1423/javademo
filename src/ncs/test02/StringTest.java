package ncs.test02;

public class StringTest {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		 double data[]= new double[5];
		 double sum = 0;
		int count=0;
		 String[] st=str.split(",");
		
		 for(int i=0;i<st.length;i++) {
			 sum+=Double.parseDouble(st[i]);
		count++;
		 
		 }
		 System.out.printf("합계 :%.3f\n",sum);
		 	 System.out.printf("평균 :%.3f",sum/count);
	}

}
