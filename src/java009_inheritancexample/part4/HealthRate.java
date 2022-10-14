package java009_inheritancexample.part4;

public class HealthRate extends Health {

	public HealthRate(String name, double height, double weight) {
		super(name, height, weight);
	}

	private double standardHealth() {
		// 표준체중 로직구현을 구현하세요.

		return (height-100)*0.9;
	}

	private String rateCheck() {
		// 비만도를 로직구현을 구현하세요
		 B=((weight-standardHealth())/standardHealth()*100);
       if(B>=20) {
    	   System.out.println("비만");
       } else if(B>=10) {
    		   System.out.println("과제충");
       }else {System.out.println("정상");
       }
    	    
       
		return B;
	}

	// prn()메소드 오버라이딩
	@Override
	public void prn() {
		System.out.printf("%s님의 신장 %.0f , 몸무게 %.0f  %s입니다.\n", name, height, weight, rateCheck());
	}

}// end HealthRate