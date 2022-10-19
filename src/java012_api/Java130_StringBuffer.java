package java012_api;

public class Java130_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");

		// 4인덱스에 "jsp" 문자열을 삽입
		sb.insert(4, ",jsp");
		System.out.println(sb);// java,jsp test
		// 4인덱스부터 8인덱스미만 사이의 문자열을 삭제
		sb.delete(4, 8);
		sb.append(" start");
		System.out.println(sb);// java test start

		// 문자열을 반대로 변경
		sb.reverse();
		System.out.println(sb);// trats tset avaj

		// String->StringBuffer->String
		String data = "mybatis orm";
		StringBuffer sf = new StringBuffer(data);
		sf.reverse();
		System.out.println(sf);
		System.out.println(data);
		String re = sf.toString();
		System.out.println(re);

		// char[]->String->StringBuffer

		char[] arr = { 'k', 'o', 'r', 'e', 'a' };
		String sp = String.valueOf(arr);
		StringBuffer se = new StringBuffer(sp);
		// StringBuffer sr=new StringBuffer();
		// sr.append(sp);
		se.reverse();
		System.out.println(se);

		System.out.println(new StringBuffer(String.valueOf(arr)).reverse());
		// 한번에 reverse 시키는법

		// StringBuffer ->String ->char[]로
		String st = se.toString();
		char[] val = st.toCharArray();
		System.out.println(val);
		System.out.println(se.toString().toCharArray());

	}

}
