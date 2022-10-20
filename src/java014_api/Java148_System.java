package java014_api;

import java.text.SimpleDateFormat;

public class Java148_System {

	public static void main(String[] args) {
		//currentTimeMillis():1970.1.1부터 초단위로
		//누적한 값을 리턴
		//하루는 86400초 1초는 1000밀리세컨드
		long curr=System.currentTimeMillis();
		System.out.println(curr);

		//HH: 24시간   ,hh :12시간
		String pattern="yyyy-MM-dd HH:mm:ss a EEEE";
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		
		String data=sdf.format(curr);
		System.out.println(data);
		
		
	}

}
