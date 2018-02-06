package OOP_Concept;

public class TestTechnology {

	public static void main(String[] args) {

		
			IPhone i=new IPhone();// i is the object reference name
			i.TouchScreen();;// which method will call and why? child class IPhone method will call

	
		// can i create the object of parent class? yes
	
			Technology tech =new Technology();
			tech.TouchScreen();
			
			
			}


}

//Q: may i create an object of IPhone class( currently there is no relationship there) ? why? yes because public class
//When parent and child has same method then which method will be called? child class method will be call because child class can't inherit the same as parent class property.
//java will say use your own method first- use that method.java compiler will decide which method will call- preference will be given to child class method.