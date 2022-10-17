package java009_practice;

public class practice {

	public static void main(String[] args) {
		/*
		 [출력결과] 
		  이름   영화제목   구매수        가격    할인된 가격
		  홍길동	아이언맨	1	         10000	10000
          김철수	겨울왕국	1	         10000	8000
          김나미	수리남	1	         12000	12000
		 * 겨울왕국의 경우 20%할인 행사중
		 *출력하시오! 상속하여
		 */
		
		
		BuyerTest bt[]=new BuyerTest[3];
		bt[0]=new BuyerTest("홍길동","아이언맨",1,10000,10000);
		bt[1]=new BuyerTest("김철수","겨울왕국",1,10000,8000);
		bt[2]=new BuyerTest("김나미","수리남",1,12000,12000);

		System.out.printf("%4s %5s %6s %7s %9s\n","이름","영화제목","구매수","가격","할인된가격");
		for(BuyerTest hh: bt)
			System.out.println(hh.toString());
	}

}
