package java004_array;

public class Java041_array {

	public static void main(String[] args) {
		int[] data1 = new int[3];// 0
		long[] data2 = new long[3]; // 0L
		float[] data3 = new float[3]; // 0.0F
		double[] data4 = new double[3];// 0.0
		char[] data5 = new char[3];//
		boolean[] data6=new boolean[3];
		String[] data7=new String[3];
		for (int i = 0; i < data5.length; i++) {
			System.out.println(data5[i]);
		}
		System.out.println("=========================================");
		char a=' ';
		char b='\u0020';
		char c='\u0000';
		char d=0;
		
		System.out.println(a==b);
		System.out.println(c==d);

	}

}
