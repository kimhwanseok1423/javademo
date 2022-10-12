package java004_practice;

public class Java044_array {

	public static void main(String[] args) {
		int[][] num = new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.printf("%4d", num[i][j]);
				
			}
			System.out.println();
			
		}
		for (int col = 0; col < 2; col++) {
			for (int row = 0; row < num.length; row++) {
				System.out.printf("%4d", num[row][col]);
			}
			System.out.println(" ");
		}
		
	}

}
