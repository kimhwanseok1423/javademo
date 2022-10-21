package java016_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



/*
 * 직렬화(serializable)
 * 1.객채를 연속적인 데이터로 변환하는 것이다.
 * 반대로는 역직렬화이다.
 * 2.객채의 맴버변수들의 값을 일렬로 나열하는 것이다.
 * 3.객채를 저장하기 위해서는 객채를 직렬화해야 한다.
 * 4.객채를 저장한다는 것은 객채의 맴버변수의 값을 저장한다는 것이다.
 * 5. 객채를 직렬화하여 입출력할수있는 스트림
 * ObjectInputStream,ObjectOutputStream
 * 6.직렬화에서 제외할 멤버변수에서는 transient를 선언한다.
 */












class Phone implements Serializable {

	String name;
	int price;

	public Phone() {

	}

	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%s %d\n", name, price);
	}
}// phone

public class Java176_stream {
	public static void main(String[] args) {
		File file = new File("src/java016_stream/phone.dat");
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		FileInputStream fi = null;
		ObjectInputStream oi = null;

		try {
			fs = new FileOutputStream(file);
			os = new ObjectOutputStream(fs);

			Phone p = new Phone("android", 5000);
			os.writeObject(p);
			System.out.println("객체 저장");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				os.close();
				fs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/////////////////////////////////////////////////////////////

		try {
			fi = new FileInputStream(file);
			oi = new ObjectInputStream(fi);
			Phone p = (Phone)oi.readObject();
			System.out.println(p.toString());

			String sn = (String)(oi.readObject());
			System.out.println(sn.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fi.close();
				oi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
