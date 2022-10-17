package java009_practice;

public class BuyerTest extends Buyer {
int discountPrice;//할인된 금액


public BuyerTest() {}


	
	public BuyerTest(String name, String movie, int count,int price,int discountPrice) {
		super(name,movie,count,price);
		this.discountPrice=discountPrice;
	}
	
	private int discountPrice() {
		
		if(movie=="겨울왕국")
			return  8000;
		else if(movie =="수리남")
			return 12000;
		else 
			return 10000;
	}
	@Override
	public String toString() {
		String data = name + "\t" + movie + "\t" + count + "\t" + price+"\t"+ discountPrice;
		return data;
}
}