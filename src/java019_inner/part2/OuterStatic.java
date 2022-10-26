package java019_inner.part2;

public class OuterStatic {
	private int x;
	static private int y;
	
	static void call() {
		y=9;
		System.out.println(y);
	}
	static class InnerStatic{
		int z;
		void prn() {
			//비 static 외부 자원을 static 내부클래스에서 참조 할수 없다.
			//x=50;
			y=20;
			z=40;
			System.out.printf("y=%d, z=%d\n",y,z);
			
		}
	}

}
