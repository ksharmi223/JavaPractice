package JavaPractice;

public class LocalAndGlobalVariable {
	
	//local and global variable
	int a= 23;
	static String b="Arwa";

	public static void main(String[] args) {
		LocalAndGlobalVariable abc=new LocalAndGlobalVariable();
		System.out.println(abc.a);
		System.out.println(b);
		int o=6;
		//System.out.println(m);give error because local
		int g=abc.scooter();
		System.out.println(g);
		
	}
	public void toy() {//local variable
		int m=12;
		
	}
	public int scooter() {
		int n=14;
		return n;
	}
}
