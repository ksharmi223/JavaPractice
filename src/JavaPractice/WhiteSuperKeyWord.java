package JavaPractice;

public class WhiteSuperKeyWord extends BlackSuperKeyWord{

	public WhiteSuperKeyWord(){
		super(20,30);
		
	System.out.println("child");

	}
	public static void main(String args[]) {
		WhiteSuperKeyWord vm=new WhiteSuperKeyWord();
		
	}
}
//How to call parent class constructor?= we have to use super keyword-the moment i create the object it will come to child class constructor then go to supper keyword
// then go to parent class constructor based on parameterized on parent class.
// "super keyword" used to call parent class contractor - if we don't write super keyword then default constructor will be call.
//super keyword should be the fist line in the constructor.
// if we want to call multiple parent call constructor then we also have to create multiple constructor in child class to use super class- that call 
//constructor to constructor mapping.
