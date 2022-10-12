package java006_class.part04;

public class Java068_class {
public static void main(String[] args) {
	MenuShop m1=new MenuShop();
	m1.menu="떡볶이";
	m1.price=2000;
	m1.cnt=3;
	m1.display();
	System.out.println(" ");
	MenuShop m2=new MenuShop();
	m2.menu="김말이";
	m2.price=500;
	m2.cnt=2;
	m2.display();
	System.out.println(" ");
	MenuShop m3=new MenuShop();
	m3.menu="오뎅";
	m3.price=300;
	m3.cnt=4;
	m3.display();
	System.out.println(" ");
	int total=m1.count()+m2.count()+m3.count();
	System.out.println("총 주문금액 :" +total);
	
}
}

/*
메뉴명    가격     주문횟수
떡볶이     2000    3
김말이     500     2
오뎅      300     4
*/