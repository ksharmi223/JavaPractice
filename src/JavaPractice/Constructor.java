package JavaPractice;

public class Constructor {
	
	
	public Constructor() {
		System.out.println("default");
		
	}
	public Constructor( String i) {
		System.out.println("single parameter");
	}
	
	public Constructor ( String x, int y) {
		System.out.println("double parameter" );
	
	}
	public static void main( String[] args) {
		
		Constructor con=new Constructor();
		Constructor con1=new Constructor("Bangladesh");
		Constructor con2=new Constructor("new York", 20);
	}


}
// constructor mean- is a class entity which is used to define some class features while creating the object. While creating the object if you want to define class some
//features in form of global variable in the form of object.
// Constructor looks like function but not a function
//Constructor name must be same as class name
// We don't write any return type- no void, static
//In Constructor you can do anything. these are different type of constructor - default( with zero parameter), one parameter , two parameter.
//Constructor can be overloaded- we can not have constructor with same name
//How to call a constructor? Immediately after creating the object of the class constructor will be called.
//How to call a method- we need to call by object reference but for constructor it doesn't need to call by reference.
//If we don't define any constructor still there is a default or hidden constructor is always there.
//Q:if you don't have any constructor and you create an object of a class what will happen? default constructor will be call always



