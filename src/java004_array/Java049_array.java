package java004_array;

public class Java049_array {

	public static void main(String[] args) {
		
		char[][] alpa=new char[][] {{'a','b','c','d'},{'a','b','c','d'},{'a','b','c','d'},{'a','b','c','d'},};
		for(int i=0;i<4;i++) {
			for(int y=0;y<4;y++) {
				if(i==y) { System.out.printf("%4s%4c","*",alpa[i][y]);
					
				}
				else{System.out.printf("%4c",alpa[i][y]);}
				
				}
			
			System.out.println("");
			if(i==alpa.length-1) {
					for(int k=0;k<alpa[i].length;k++) {
						System.out.printf("%4c",alpa[i][k]);
					}
				}
		
			} System.out.printf("%4s","*");
			
		}
	}


/* [0][0] [1][1] [2][2] [3][3] [4][4]
	
	




*/