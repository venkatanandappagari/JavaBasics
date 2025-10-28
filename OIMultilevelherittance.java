package javaProgramss.JavaOops;
class Car1{
	Car1(){
		System.out.println("this is a standard car");
	}
}
class Model2 extends Car1 {
	Model2(){
		System.out.println("this is a model 2 of a standard car");
	}
}
class Custom extends Model2{
	Custom(){
		System.out.println("this is a custom model of a standard car for enthusiast customers");
	}
}

public class OIMultilevelherittance {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c=new Car1();
		Custom cs=new Custom();

	}

}
