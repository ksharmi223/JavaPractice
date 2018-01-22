package JavaPractice;

public class JavaFunction {

	public static void main(String[] args) {
		JavaFunction my = new JavaFunction();
		
		int s=my.Summer();
		System.out.println(s);
		
		int p=my.Fall(350, 450);
		System.out.println(p);
		
		String t=my.Winter();
		
		System.out.println(t);
		
		my.Information("Aqsa", "Khandakar");
		my.Information(7);
		my.Information('F');
		

	}
	public int Summer() {
		int sale=1000;
		int exp=400;
		int profit=sale-exp;
		return profit;
		
	}
	public int Fall(int x,int y) {
		int z=x+y;
		return z;

		
		
	}
	public String Winter() {
		String weather="snow";
	
		return weather;
	}
	
	
	public void Information(String x,String y){
		System.out.println(x +" "+ y);
	}
	public void Information(int z) {
		System.out.println(z);
		
	}
	public void Information(char w) {
		System.out.println(w);
	
	}
	}


	

