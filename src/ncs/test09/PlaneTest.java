package ncs.test09;

public class PlaneTest {

	public static void main(String[] args) {
		// Airplane 과 Cargoplane 객체 생성
		// 생성된 객체의 정보 출력
		System.out.println("Plane\tfuelSize");
		System.out.println("----------------");
		Airplane air = new Airplane("L747", 1000);
		air.printInfo();
		Cargoplane car = new Cargoplane("C40", 1000);
		car.printInfo();

		// Airplane 과 Cargoplane 객체에 100 씩 운항
		// 100 운항 후 객체 정보 출력
		// Airplane 과 Cargoplane 객체에 200 씩 주유
		// 200 주유 후 객체 정보 출력
		System.out.println("100 운항\nPlane\tfuelSize");
		System.out.println("----------------");
		air.flight(100);
		car.flight(100);

		air.printInfo();
		car.printInfo();
		System.out.println("200 주유\nPlane\tfuelSize");
		System.out.println("----------------");
		air.refuel(200);
		car.refuel(200);
		air.printInfo();
		car.printInfo();

	}

}
