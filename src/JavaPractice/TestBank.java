package JavaPractice;

public class TestBank {

	public static void main(String[] args) {
		
		Bank bk=new Bank();
		bk.deposit();
		bk.withdrawal();
		bk.transfer();
		bk.payment();
		
		bk.homeLoan();
		bk.moneyMarket();
		
		CapitalOneBank ca=new Bank();
		
		ca.deposit();
		ca.payment();
		ca.transfer();
		
		
		
		

	}

	
}
