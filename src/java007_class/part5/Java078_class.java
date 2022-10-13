package java007_class.part5;

/*
 * 기업은행 42523-52325 100000
 * 하나은행52253-22623 153000
 * 신한은행 16239-95235 256000
 * 총납입액:509000
 * 
 */



public class Java078_class {

	public static void main(String[] args) {
		
		CreditCard[] cd=new CreditCard[3];
		cd[0]=new CreditCard("기업은행","42523-52325",100000);
		cd[1]=new CreditCard("하나은행","52253-22623", 153000);
		cd[2]=new CreditCard("신한은행" ,"16239-95235" ,256000);
		int sum=0;
		for(int i=0;i<cd.length;i++) {
			sum+=cd[i].pay;
			System.out.println(cd[i].toString());
		}
		System.out.println("총납입액 : "+sum);
		
		
	} 

		
	}
	

