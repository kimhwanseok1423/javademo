package java004_practice;

public class Java048_array {

	public static void main(String[] args) {
		int[][] num = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		for (int row = 0; row < 4; row++) {
			for (int index = 0; index < 5; index++) {
				if(row%2==1) {
					System.out.printf("%4d",num[row][num[row].length-1-index]);
				}else {System.out.printf("%4d",num[row][index]);}
				
				
				
	}System.out.println(" ");
	
	
	
	
	
	}

}
}
