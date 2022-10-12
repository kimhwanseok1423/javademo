package java001_basic.prob;
/*
* 동전교환프로그램
* 1 가장 적은 동전으로 교환할 수 있는 프로그램을 작성하시오
* 2 [출력결과]
*   500원: 15개 
    100원: 2개
    50원: 1개
    10원: 2개
    1원: 7개
    */

public class Prob07 {

	public static void main(String[] args) {
		int money = 7777;
		int mok=money/500;		 //15개
		int moa=(money%500)/100;  //2개
	   int mob=(money%500)%100/50; //1개
	  int moc=(money%500)%100%50/10;//2개  
		int mod=(money%500)%100%50%10; //7개
		System.out.printf("500원:%d개,100원:%d개,50원:%d개,10원:%d개,1원:%d개\n",mok,moa,mob,moc,mod);	
		
				
	}//end main()

}//end class


