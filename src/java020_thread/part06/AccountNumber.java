package java020_thread.part06;

import java.util.Scanner;

public class AccountNumber {
	public void withDraw() {
		
		public class Bank implements Runnable{
			private long depositMoney =100000; //은행잔고
			private long balance ; //찾을 금액
			private Scanner sc=new Scanner(System.in );
			
			System.out.printf("%s  입장\n",Thread.currentThread().getName());
			try {
				System.out.println("출금 금액 입력:");
				balance=sc.nextLong();
			
			}catch(NumberFormatException ex) {
				System.out.println(ex.toString());
			}
		
		
		if(depositMoney>=balance) {
			depositMoney=depositMoney-balance;
			System.out.printf("남은금액은 : %d원 입니다.",depositMoney);
		
		}else {System.out.println("잔액이 부족합니다.");}
	}

	}

}
