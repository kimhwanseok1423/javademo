package ncs.test09;

 abstract class Plane {
String planeName;
int fuelSize;

public Plane() {}
		public Plane(String planeName,int fuelSize) {
			this.planeName=planeName;
			this.fuelSize=fuelSize;
			
}
		public void refuel(int fuel) {
			
			fuelSize+=fuel;
		}
		public  abstract void flight(int distance);
		
		public String getName() {
			return planeName;
		}
		public void setName(String planeName) {
			this.planeName = planeName;
		}
		public int getFuelSize() {
			return fuelSize;
		}
		public void setFuelSize(int fuelSize) {
			this.fuelSize = fuelSize;
		}
	
		public void printInfo() {
			System.out.println(planeName+"\t"+fuelSize);
		}
		
}
