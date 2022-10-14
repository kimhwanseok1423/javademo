package java009_inheritancexample.part2;

public class StudentExam extends Human {
	String hak;// 학번
	
	
	public StudentExam() {
		
	}
	
	
	public StudentExam(String name, int age, int height, int weight) {
		super(name,age,height,weight);
		this.hak=hak;
	
		
	}
	
	@Override
	public String toString() {
		return String.format("%s,%d,%d,%d,%s\n",name,age,height,weight,hak);
	}

 
}
