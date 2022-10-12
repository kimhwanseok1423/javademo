package java004_array;

public class Java050_array {

	public static void main(String[] args) {
	//	int[][] num=new int[3][];
	//	num[0]=new int[2];//0행 2열생성
	//	num[1]=new int[3];//1행 3열생성
	//	num[2]=new int[5];//2행 5열이 생성
		
		int[][] num=new int[][] {{1,2},{3,4,5},{6,7,8,9,10}};
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.printf("%4d",num[i][j]);
			}
			System.out.println("\n");
		}

	}

}
