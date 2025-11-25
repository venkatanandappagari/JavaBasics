package com.oops.java;
class Charger{
	private String brand;
	private float voltage;
	public Charger() {
		
	}
	public Charger(String brand,float voltage) {
		this.brand=brand;
		this.voltage=voltage;
	}
	void setBrand(String brand) {
		this.brand=brand;
	}
	void setVoltage(float voltage) {
		this.voltage=voltage;
	}
	public String getBrand() {
		return brand;
	}
	public float getVoltage() {
		return voltage;
	}
}
class OS{
	private String name;
	private int size;
	
	public OS() {
		super();
		
	}
	public OS(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
class Mobile{
	OS os=new OS("Android",512);
	void hasA(Charger ch) {
		System.out.println(ch.getBrand());
		System.out.println(ch.getVoltage());
	}
}

public class AggregationAndComposition {

	public static void main(String[] args) {
		
		Charger ch=new Charger("Samsung",25.5f);
		Mobile m=new Mobile();
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		
		m.hasA(ch);
	}

}
