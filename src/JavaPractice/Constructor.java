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




