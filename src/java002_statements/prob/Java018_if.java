package java002_statements.prob;

public class Java018_if {

	public static void main(String[] args) {
		
		boolean member=false;
		String grade="일반";
		if(!member) {
			if(grade=="VIP"){
				System.out.printf("고객님은 %s이며 %d%%적립\n",grade,30);
		}else {System.out.printf("고객님은 %s이며 %d%%적립\n",grade,10);
			
		}
		}else {System.out.printf("고객님은 %s이며 %d%%적립\n",grade,0);
		}
	}

}
