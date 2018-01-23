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
		
		ConstructorThisKeyword obj=new ConstructorThisKeyword("Rockville", 20852);// before using this key word it was calling from local variable
	}

}
// Duplicate constructor now allowed -we need to overload it
// To initialize global veritable we need to use this keyword:
// " this "keyword used to initialize the class variable in the constructor
// this.globalvariable=localvariable.
//