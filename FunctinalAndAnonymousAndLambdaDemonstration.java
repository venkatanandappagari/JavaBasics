package com.oops.java;

@FunctionalInterface
interface Display2{
	void dis2();
}



@FunctionalInterface
interface Display3{
	void dis3(int a);
}




public class FunctinalAndAnonymousAndLambdaDemonstration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demonstration of innerClass
		//level1 security
		class subDisplay2 implements Display2{
			@Override
			public void dis2() {
				System.out.println("inside the inner class");
			}
		}
		subDisplay2 s=new subDisplay2();
		s.dis2();
		
		//level2 security
		//demonstration of anonymous inner class
		//achieved by using loose coupling
		Display2 r=new Display2() {
			@Override
			public void dis2() {
				System.out.println("inside the anonymous inner class");
			}
		};//semicolon to be placed for the anonymous inner class
		r.dis2();
		
		
		
		//level3 security
		//By using lambda expressions
		//lambda expressions are only for functional interfaces
		Display3 a=(int c)->{System.out.println("inside a lambda "+c);};
		a.dis3(100);
	}

}
