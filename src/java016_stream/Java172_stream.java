package java016_stream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Java172_stream {
public static void main(String[] args) throws IOException {
	//File file=new File("src/java016_stream/temp");
	
	//File file=new File("src/java016_stream/a/b");
	File file=new File("src/java016_stream/sample.txt");
	
	
	//종료시 삭제하도록 설정
	file.deleteOnExit();
	
	Scanner sc=new Scanner(file);
	System.out.println(sc.nextLine());
	System.out.println(sc.nextLine());
	sc.close();
//	file.createTempFile("source", "test");
	//여러개의 폴더를 만들어야되는경우 (1)
		
//	if(file.isDirectory()) {
	//	file.delete();
		//file.deleteOnExit();

	//	System.out.println("폴더 삭제");
	//	}else {
	//		System.out.println("폴더 없음");
		}
	}



//}
