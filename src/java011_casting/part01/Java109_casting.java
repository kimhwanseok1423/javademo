package java011_casting.part01;
/*
   데이터 타입
 * 객채형변환-참조데이터 타입
 * 1.상속관계일ㄸ ㅐ 형변환이 가능하다 (is a )
 * 2.업케스팅 발생된후 다운 캐스팅을 ㅏ할수있다.
 * 업캐스팅: 부모객채로 자식객채를 참조하도록 형변환되는 기술
 * 다운캐스팅: 업캐스팅을 다시 원상복귀해주는 형변환하는 기술
 * 
 */
public class Java109_casting {
public static void main(String[] args) {
	Parent p=new Parent();
	Child c=new Child();
	
	// Parent p=new Child();
	p=c;//업 케스팅
	p.process();
	//p.call();
	
	
	//다운케스팅
	Child d=(Child) p;
	
	//객채생성 및 업캐스팅
	Parent pt=new Child();
	pt.process();
	
	//다운캐스팅
	Child cn=(Child)pt;
	cn.call();
	
	
	
}
}
