package java017_collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Java183_Vector {

//	[결과]
	// kim 56 78 12 146
	// hong 46 100 97 243
	// park 96 56 88 240
	public static void main(String[] args) {
		String path = "./src/java017_collection/score.txt";
		/*
		 * try { File file = new File(path); Scanner scan =new Scanner(file);
		 * while(scan.hasNextLine()) { System.out.println(scan.nextLine());
		 * 
		 * } }catch(FileNotFoundException e) {
		 * 
		 * }
		 */

		Vector<Sawon> vt = lines(path);

		prnDisplay(vt);
	}

	private static Vector<Sawon> lines(String fileName) {
		// strName 매개변수의 값을 이용하여 vector에 데이터를 저장한후
		// 리턴하는 프로그램 구현
		Vector<Sawon> vt = new Vector<Sawon>();
		try (Scanner sc = new Scanner(new File(fileName))) {
			while (sc.hasNextLine()) {//kim:56/78/12
				String[] data = sc.nextLine().split("[:/]");
				Sawon sn = new Sawon(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]),
						Integer.parseInt(data[3]));
				vt.add(sn);
			}
		}catch(FileNotFoundException ex) {
			System.out.println(ex.toString());
			
		}
		return vt;

	}

	private static void prnDisplay(Vector<Sawon> vt) {
		// vt에 저장된 객채물을 출력결과와 같이 프로그램 구현
		for(Sawon sn:vt) {
			System.out.println(sn.toString());
		}

	}

}
