package java004_array;

public class Java043_array {

	public static void main(String[] args) {
		// 3행 2열의 2차원 배열
		int[][] num = new int[3][2];
		num[0][0] = 1;
		num[0][1] = 2;
		num[1][0] = 3;
		num[1][1] = 4;
		num[2][0] = 5;
		num[2][1] = 6;
		for(int row=0;row<num.length;row++) {
			System.out.println(num[row][0]);
			System.out.println(num[row][1]);
			
		}
		System.out.println("---------------------------------------");
		
		for(int row=0;row<num.length;row++) {
			for(int col=0;col<num[row].length;col++) {
				System.out.printf("%4d",num[row][col]);
			}
		}
	}

}
