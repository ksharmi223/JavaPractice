package JavaPractice;

import sun.awt.AWTAccessor.SystemColorAccessor;

public class StaticAndNonStatic {
	
	// class variable or global variable
	// class variable and class method call class member
	// if you want to access non static member ( method and variable) then you have to create the object
	//to access it by using new key word.
	//
	int a= 23;
	static String b="Arwa";// static is a keyword - so art with small "s" letter
	

	public static void main(String[] args) {
		// calling non-static member:
		
		StaticAndNonStatic c=new StaticAndNonStatic();
		c.Car();
		c.Van();
		System.out.println(c.a);
		
		// calling static member:direct calling
		Bus();
		System.out.println(b);
	}
	public void Car() {//non-static// class method
		System.out.println("Car");
	
	}
	public static void Bus() {// static method
		System.out.println("Bus");
	}
	public void Van() {
		System.out.println("Van");
	}
}

	//when common feature for all- create Static 