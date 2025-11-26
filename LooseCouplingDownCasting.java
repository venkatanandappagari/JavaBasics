//package com.oops.java;

class Plane{
	void takeOff() {
		System.out.println("Plane is taking-off");
	}
	 void fly(){
		System.out.println("Plane flies");	}
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Cargo Plane flies at lower Heights");
	}
	//specialized Method
	void carryCargo() {
		System.out.println("Cargo Plane carries goods and delivery stuff");
	}
}
class PassengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Passenger Plane flies at medium heights");
	}
	//specialized Method
	void carryPeople() {
		System.out.println("Passenger Plane carries People");
	}
}
class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Fighter Plane flies at higher heights");
	}
	//specialized Method
	void carryWeapons() {
		System.out.println("Fighter Plane carries Weapons");
	}
}
public class LooseCouplingDownCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to achieve polymorphism we need loose coupling
		Plane ref;
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		//works for overriden methods
		//works for inherited methods
		
		ref=cp;
		ref.takeOff();
		ref.fly();
		//for specialized methods
		//DownCasting from Parent to child
		((CargoPlane)(ref)).carryCargo();
		ref=pp;
		ref.takeOff();
		pp.fly();
		//DownCasting from Parent to child
		((PassengerPlane)(ref)).carryPeople();
		
		ref=fp;
		ref.takeOff();
		fp.fly();
		//DownCasting from Parent to child
		((FighterPlane)(ref)).carryWeapons();
	}

}

