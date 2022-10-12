package java004_practice;

public class Java043_array {
public static void main(String[] args) {
	int[][]num=new int[3][2];
	num[0][0]=1;
	num[0][1]=2;
	num[1][0]=3;
	num[1][1]=4;
	num[2][0]=5;
	num[2][1]=6;
	for(int i=0;i<num.length;i++) {
		System.out.println(num[i][0]);
		System.out.println(num[i][1]);
	}
	for(int i=0;i<num.length;i++) {
		for(int j=0;j<num[i].length;j++) {
			System.out.printf("%4d",num[i][j]);
		}
	}
	
	
}
	
	
	
	
	
}
