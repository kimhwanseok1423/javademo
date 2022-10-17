package java009_practice;

public class Buyer {

	String name; // 이름
	String movie; // 영화제목
	int count; // 사는갯수
	int price ; //가격
	
	Buyer(){}
	
	Buyer(String name, String movie, int count,int price) {
		this.name = name;
		this.movie = movie;
		this.count = count;
		this.price=price;
	}

	public String toString() {
		String data = name + "\t" + movie + "\t" + count + "\t" + price;
		return data;
	}
}// end Health


