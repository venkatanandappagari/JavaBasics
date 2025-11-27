package com.oops.java;


class Plane1{

	 void fly(){
		System.out.println("Plane flies");	}
}
class CargoPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("Cargo Plane flies at lower Heights");
	}

}
class PassengerPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("Passenger Plane flies at medium heights");
	}

}
class FighterPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("Fighter Plane flies at higher heights");
	}

	
}
class Airport{
	public void permit(Plane1 ref) {
		ref.fly();
	}
}

public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to achieve polymorphism we need loose coupling
		//upcasting
		System.out.println("demonstration of upcasting:");
		
		CargoPlane1 cp=new CargoPlane1();
		PassengerPlane1 pp=new PassengerPlane1();
		FighterPlane1 fp=new FighterPlane1();
		Airport ap=new Airport();
		ap.permit(cp);
		ap.permit(pp);
		ap.permit(fp);
		System.out.println("");
		System.out.println("demonstration of loose coupling:");
		Plane1 cp1=new CargoPlane1();
		Plane1 pp1=new PassengerPlane1();
		Plane1 fp1=new FighterPlane1();
		cp1.fly();
		pp1.fly();
		fp1.fly();
		
	}

}
