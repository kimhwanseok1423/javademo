package java010_abstract_interface.part05;

public class Life extends Animal implements SampleA,SampleB {
	public Life() {
		System.out.println("Life");
	}
	
	@Override

	public void call() {
		System.out.println("call");
		// TODO Auto-generated method stub
		
	}@Override
	public void prn() {
		// TODO Auto-generated method stub
		System.out.println("prn");
	}
	
}
