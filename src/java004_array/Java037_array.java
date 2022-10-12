package java004_array;

public class Java037_array {

	public static void main(String[] args) {
	/*
	  변수: 하나의 값을 저장하기 위한 메모리 공간
	  배열: 서로 관련이 있는 데이터 타입이 같은 데이터의 집합
	 */
		
		int ko=90;
		int en=80;
		int jp=40;
		int[] arr; //배열선언
		arr=new int[3];
		// int[] arr=new int[3];
		arr[0]=90;
		arr[1]=80;
		arr[2]=40;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
	   for(int i=0;i<=2;i++) {
		   System.out.println(arr[i]);
	   }
	}

}
