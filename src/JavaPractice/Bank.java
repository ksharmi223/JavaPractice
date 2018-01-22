package JavaPractice;

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


