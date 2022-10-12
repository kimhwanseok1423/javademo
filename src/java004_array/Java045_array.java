package java004_array;

public class Java045_array {

	public static void main(String[] args) {
		/*
		 *  [출력결과]
		   홍길동  90 85 40 215 71.7
		   김길동 100 35 75 210 70.0
		 *
		 *3
		 */ 
		String[] name= {"홍길동","김길동"};
		int[][] jumsu= {{90,85,40},{100,35,75}};
		int sum=0;
		
		
		for (int index = 0; index < name.length; index++) {
			
				System.out.printf("%8s", name[index]);
				for(int col=0;col<3;col++) {
					System.out.printf("%4d",jumsu[index][col]);
		 sum+=jumsu[index][col];
			}
				System.out.printf("%4d %6.1f\n",sum,sum/3.0);
			
		
		
		
	//  90  85 40
	//  100 35  75  
	 }
		
	}

}
