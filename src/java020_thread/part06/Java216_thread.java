package java020_thread.part06;

public class Java216_thread {

	public static void main(String[] args) {
	Bank bank=new Bank();
	Thread aPoint =new Thread(bank,"A지점");
	aPoint.start();
	
	
	Thread bPoint=new Thread(bank,"B지점");
	bPoint.start();

	}

}
