package java006_class.part04;



/*
 분식점 프로그램
 1.메뉴명
 2.가격
 3.주문수
 4.계산 
 
 객체 속성: 메뉴명 가격 , 주문갯수
 
  메뉴명    가격     주문횟수
  떡볶이     2000    3
  김말이     500     2
  오뎅      300     4
 */

public class MenuShop {

	String menu;
	int price;
	int cnt;
	
	int count() {
		return price*cnt;
		
	}
	void display() {
		System.out.printf("메뉴명 :"+menu);
		System.out.printf("가격:"+price);
		System.out.printf("주문갯수:"+cnt);
		System.out.printf("금액:"+count());
	}

}
