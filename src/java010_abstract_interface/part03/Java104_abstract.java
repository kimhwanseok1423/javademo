package java010_abstract_interface.part03;

public class Java104_abstract {

	public static void main(String[] args) {
		Flute fl =new Flute("Flute");
		System.out.println(fl.name);
       fl.play();
       
       Piano p=new Piano("Piano");
       System.out.println(p.name);
       p.play();
	}

}
