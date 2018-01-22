package JavaPractice;

public class IfElseAndLoop {

	public static void main(String[] args) {
		
		int x=350;
		int y=450;
		int z=550;
		
		if(x>y && x>z){
			System.out.println("x is the highest number");
		}
		else if (y>z) {
			System.out.println("y is the highest number");	
		}
		else {
			System.out.println("z is the highest number");
		}
		
		
		System.out.println("*****************************");
		System.out.println("print 0 to 10 with whle loop");
		//print 0 to 10
		
		int i=10;
		while (i>=0) {
			System.out.println(i);
			i--;				
		}
		System.out.println("**********************");
		System.out.println("Print 0-10 with for loop");
		
		for(int j=10;j>=0;j--) {
			System.out.println(j);
		}
		System.out.println("increment and decrement");
		
		int s=500;
		int t=++s;
		
		System.out.println(s);
		System.out.println(t);
		System.out.println("***");
		
		int g=500;
		int h=g++;
		
		System.out.println(g);
		System.out.println(h);
		
		System.out.println("****");
		int m=500;
		int n=--m;
		
		System.out.println(m);
		System.out.println(n);
		System.out.println("***");
		
		int a=500;
		int a1=a--;
		
		System.out.println(a);
		System.out.println(a1);
		
		System.out.println("****");
	}

}
