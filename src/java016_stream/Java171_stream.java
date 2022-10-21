package java016_stream;

import java.io.File;

public class Java171_stream {

	public static void main(String[] args) {
		//File file=new File("src/java016_stream/temp");
	File file=new File("src/java016_stream/a/b");	//여러개의 폴더를 만들어야되는경우 (1)
		if(!file.isDirectory()) {
	//	file.mkdir();	//생성할 폴더가 하나이면 이렇게 쓰기
	    file.mkdirs(); //여러개의 폴더를 만들어야되는경우 (2)
		System.out.println("폴더 생성");
		}else {
			System.out.println("폴더 존재");
		}
	}

}
