package org.example;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Vehicle vehicle=new Truck();
		Vehicle vehicle2=new Vehicle()
				{

					@Override
					double calculateFuelEfficiency() {
						// TODO Auto-generated method stub
						return 0;
					}

					@Override
					double calculateTripDistance() {
						// TODO Auto-generated method stub
						return 0;
					}
			
				};*/
		Flyer bird=new Bird();
		Flyer superMan=new Flyer()
				{

					@Override
					public void fly() {
						// TODO Auto-generated method stub
						System.out.println("SuperMan Flying");
					}

					@Override
					public void takeOff() {
						// TODO Auto-generated method stub
						System.out.println("SuperMan Taking Off");
					}

					@Override
					public void land() {
						// TODO Auto-generated method stub
						System.out.println("SuperMan Landing");
					}
			
				};
				System.out.println(bird);
				System.out.println(superMan);
				superMan.takeOff();
				superMan.fly();
				superMan.land();
				
	}

}
