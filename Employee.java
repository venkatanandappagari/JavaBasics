package JavaOops;


 class Employee1 {
	String name;
	int id;
	double salary;
	boolean jobStatus;
	//default constructor
	public Employee1(){
		
	}
	//parameterized constructors
	public Employee1(String name,int id) {
		this.id=id;
		this.name=name;
	}
	public Employee1(String name,int id,double salary,boolean jobStatus) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.jobStatus=jobStatus;
	}
	//copy constructors
	public Employee1(Employee1 e3) {
		id=e3.id;
		name=e3.name;
		salary=e3.salary;
		jobStatus=e3.jobStatus;
		
	}
	//methods to demonstrate
	public void setid(int id) {
		this.id=id;
		
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public void setjobStatus(boolean jobStatus) {
		this.jobStatus=jobStatus;
	}
	//getage
	public int getid(int id) {
		return id;
		
	}
	public String getname(String name) {
		return name;
	}
	public double getsalary(double salary) {
		return salary;
	}
	public boolean getjobStatus(boolean jobStatus) {
		return jobStatus;
	}
	public void display() {
		System.out.println("name:"+name);
		System.out.println("id:"+id);
		System.out.println("salary:"+salary);
		System.out.println("job status:"+jobStatus);
	}
}
public class Employee{
	public boolean jobStatus;
	public double salary;
	public String name;
	public int id;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e=new Employee1();
		// to call the default constructor
		System.out.println("Demonstration of default constructos");
		e.display();
		System.out.println("\nto call the two argument constructor");
		Employee1 e2=new Employee1("Venkat",28);
		e2.display();
		System.out.println("\nto call the four arguement constructor");
		Employee1 e3=new Employee1("hemasai",27,0,false);
		e3.display();
		System.out.println("\nto call by copy constructor");
		Employee1 e4=new Employee1(e3);
		e4.display();
		
		System.out.println("\ncalling by usign setters and getters");
		e.setid(18);
		e.setname("Arun");
		e.setsalary(4000.0);
		e.setjobStatus(true);
		e.display();
		System.out.println("\nanonymous object demostration:");
		new Employee1("Asha", 102,400000,true).display();

//			## 🏗️ Constructors
//
//			1. **Initialization Tool**: Constructors are special methods used to initialize objects when they’re created.
//			2. **Same Name as Class**: A constructor always has the same name as the class and no return type.
//			3. **Overloading Allowed**: You can define multiple constructors with different parameter lists (constructor overloading).
//			4. **Default vs Parameterized**: If no constructor is defined, Java provides a default one. You can also create custom constructors with parameters to set initial values.
//
//			---
//
//			## 🧱 Classes
//
//			1. **Blueprint for Objects**: A class defines the structure and behavior (fields and methods) that its objects will have.
//			2. **Can Contain Multiple Members**: It can include variables, methods, constructors, and even other classes.
//			3. **Access Modifiers Control Visibility**: You can use `public`, `private`, etc., to control access to class members.
//			4. **Supports OOP Principles**: Classes are the foundation for encapsulation, inheritance, and polymorphism.
//
//			---
//
//			## 🧍 Objects
//
//			1. **Instance of a Class**: An object is a concrete entity created from a class blueprint.
//			2. **Has State and Behavior**: State is stored in fields (like `name`, `age`), and behavior is defined by methods.
//			3. **Created Using `new` Keyword**: You instantiate an object using `new`, which calls a constructor.
//			4. **Can Interact with Other Objects**: Objects can call each other’s methods and share data, enabling modular design.
//		
	}

}
