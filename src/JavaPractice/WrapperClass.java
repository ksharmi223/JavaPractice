package JavaPractice;

public class WrapperClass {

	public static void main(String[] args) {
	
		
		String x="550";
		System.out.println(x + 50);//50050

	
		// convert to int:
		
		int s=Integer.parseInt(x);
		System.out.println(s+50);
		
		// convert to double
		
		double t=Double.parseDouble(x);
		System.out.println(t+12.7);
		
		
		// convert to string
		int y= 1205;
		
		String u=String.valueOf(y);
		System.out.println(u+1205);
		
		// String z="900A";
		//int v=Integer.parseInt(z);
		//System.out.println(v);// number format exception
		
		
		
	}

}
