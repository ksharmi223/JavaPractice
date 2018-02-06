package OOP_Concept2;

public class TestBank {

	public static void main(String[] args) {
		
		Bank bk=new Bank();
		bk.deposit();
		bk.withdrawal();
		bk.transfer();
		bk.payment();
		
		bk.homeLoan();
		bk.moneyMarket();
		
		CapitalOneBank ca=new Bank();// Achieve dynamic polymorphism - child class object refer by parents interface variable- top casting
		
		ca.deposit();
		ca.payment();
		ca.transfer();
		
		// i can't any property from other interface
		// If we have any additional method inside interface we also define the class according to child class
		// can i define variable inside interface =yes
		// how to call that variable
		
		

	}

	
}
