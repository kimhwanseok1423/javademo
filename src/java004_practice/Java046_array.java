package java004_practice;

public class Java046_array {

	public static void main(String[] args) {
		int[][] num = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 }};
		for (int row = 0; row < 4; row++) {
			for (int index = 0; index < 5; index++) {
				if(num[row][index]%3==0) {
					System.out.printf("%4s","*");
				}else {
					System.out.printf("%4d", num[row][index]);
				
				}
				
			
			
				
			}System.out.println();
			}
		
	}

}
