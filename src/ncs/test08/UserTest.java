package ncs.test08;

public class UserTest {

	public static void main(String[] args) {
		User[] us=new User[3];
		us[0]=new User("user01","pass01","김철수",32,'M',"010-1234-5678");
		us[1]=new User("user02","pass02","이영희",25,'F',"010-5555-7777");
		us[2]=new User("user03","pass03","황진이",20,'F',"010-9874-5632");
		System.out.println("users list --------------------------------");
		for(int i=0;i<us.length;i++) {
			
			System.out.println(us[i]);}
System.out.println("copyUsers -----------------------------------------");
for(User sp :us)
	System.out.println(sp);
	}
	

}