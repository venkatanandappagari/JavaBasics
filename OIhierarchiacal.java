package javaProgramss.JavaOops;
class carA{
	carA(){
		System.out.println("this is a new car");
	}
}
class car11 extends carA{
	car11(){
	System.out.println("this has several features more than standard car");
	
}
}
/**
 * j
 */
class car2 extends carA{
	car2(){
		System.out.println("this is a car model which I prefer");
	}
}
public class OIhierarchiacal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carA c=new carA();
		carA c1=new car2();
		 

	}

}
