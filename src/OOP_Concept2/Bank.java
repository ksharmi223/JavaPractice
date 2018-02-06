package OOP_Concept2;

public class Bank implements CapitalOneBank,NorthForkBank,QueensCountyBank{
	
	public void deposit() {
		System.out.println("COB-deposit");
	}
	
	
	public void withdrawal(){
		System.out.println("COB-withdrawal");
	}
	
	public void transfer() {
		System.out.println("COB-transfer");
	
	}
	public void payment() {
		
		System.out.println("COB-payment");
	
	}
		
	public void studentLoan() {
	
		System.out.println("NFB-studentLoan");
	}
	
	public void homeLoan() {

		System.out.println("NFB-homeLoan");
	}
	public void personalLoan() {
		
		System.out.println("NFB-personalLoan");
		
	}
	
	public void creditCard() {
		
		System.out.println("NFB-creditCard");
	}
	public void saving() {
		System.out.println("QCB-saving");
	}
	
	public void checking() {
		System.out.println("QCB-checking");
	}
	
	public void moneyMarket() {
		System.out.println("QCB-moneyMarket");
	}
	
	
	}


// Interface: is a platform where you can define some business rule. This particular platform is available for all the system available.
//Bank class taking properties from different banks. Creating a class taking some properties from different parents.According to java rule 
//class can't not have multiple class- but in the form of interface we can- it doesn't call multilevel inheritance it call multiple inheritance.


// Example interface has 3 different method and class has two methods= It is mandatory for class to adapt/define all the interface method.

// why we are doing this?  we have separate interface and you have to follow some set of rule- for example- you should have home loan feature but you have to take care
//interest rate and other things are headeach.

// WebDrive is an interface= if you want to interact with any browser- WebDriver said to Chrome driver,FF,IE all these classes - i have 
//some set of rule regulation in the set of method if you want to use those this first you have to implement me and then define all the method in your class then 
//only you can interact with any browser. this is the biggest advantage of interface.

// In interface don't define the method body , only method prototype- The method / feature will be there but how the business logic child class will decide.

// to make connections between class and interface we need to use the key word -implements


// I can achieve multiple inheritance in the form of interface

// static method not allowed inside interface



//Interface:
//1. can not have method body-- only prototype: method implementation will be done inside child class
//2.interface variable are static in nature by default
//3.no static methods are allowed 
//4. can not create the object of interface:  interface can not interested .


	
