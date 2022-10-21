package java016_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Java169_stream {
	public static void main(String[] args) {
		File file = new File("src/java016_stream/score.txt");
		RandomAccessFile raf = null;
		try {
			// "r" :읽기만 가능하다.
			// "rw" : 읽기 쓰기가 가능하다.
			raf = new RandomAccessFile(file, "r"); // 1번째 읽어올 대상,읽고 쓰기를 할건지 대상이

			// 현재 위치 리턴
			System.out.println(raf.getFilePointer());//0
			System.out.println((char)raf.read());//k
			System.out.println(raf.getFilePointer());//1
			System.out.println(raf.readLine()); //1번째 인덱스부터 마지막까지
			System.out.println(raf.getFilePointer()); //14 
			System.out.println(raf.readLine()); //현재 줄의 인덱스부터 그줄 다  가져오기
			System.out.println(raf.getFilePointer());// 마지막 enter \r\n 포함 30
			//포인터 위치를 변경한다 (파일 처음부터 포인터를 찾는다)
			raf.seek(4);  //kim:56/78/12
			System.out.println((char)raf.read());
			System.out.println(raf.readLine());
			//지정된 수 만큼 byte를 건너뛴다. (편재 포인터가 있는 위치 기준으로 건너뛴다.)
			raf.skipBytes(2);//hong:46/100/97 //2칸뛰어서 
			System.out.println(raf.readLine());//ng:46/100/97
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		} 
		

	

	}
}
