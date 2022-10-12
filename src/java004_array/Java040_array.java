package java004_array;

public class Java040_array {

	public static void main(String[] args) {
		int[] num=new int[] {22,3,8,12};
		int odd=0;  //홀
		int even=0; //짝 
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				even+=num[i];
			}else { odd+=num[i];}
			}  System.out.println("홀수 :"+odd);
			   System.out.println("짝수 :"+even);
		}
	}


