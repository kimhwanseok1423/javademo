package java004_array.prob;

public class Prob_02 {
	public static void main(String[] args) {
	
		/*
		 * 4행 4열 data배열에 가로 세로 합계를 구하는 프로그램을 구현하시오.
		 * [출력결과]
		 *  1   2   3   6
		 *  4   5   6  15
		 *  7   8   9  24
		 * 12  15  18  45
		 */
		// 여기를 구현하시오.
		
		int[][] data = new int[4][4];
		int cnt = 1;
		// 여기를 구현하시오.
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				data[i][j] = cnt++;
				
			}
		}
		for(int i=0; i<data.length-1;i++){
			for(int j=0; j<data[i].length-1; j++){
				
			}
		}
		
	}// end main()

}
