package java020_thread.part02;

public class UserImp implements Runnable {
	
	public UserImp() {

}

@Override
public void run() {
	
	//Thread로 실행할 구문을 구현
	for(int i=0;i<=5;i++) {
		System.out.printf("%s i=%d\n",Thread.currentThread().getName(),i);
	}
}
}