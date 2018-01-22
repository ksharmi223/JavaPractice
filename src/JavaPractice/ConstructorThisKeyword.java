package JavaPractice;

public class ConstructorThisKeyword {

	String city;
	int zip;
	
	
	public ConstructorThisKeyword(String city,int zip) {
		this.city=city;
		this.zip=zip;
		
		System.out.println(city);
		System.out.println(zip);
	}
	public static void main(String[] args) {
		
		ConstructorThisKeyword obj=new ConstructorThisKeyword("Rockville", 20852);
	}

}
