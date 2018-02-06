package JavaPractice;

public class StringManipulation {

	public static void main(String[] args) {
		
		
		String st= "the snow have started in Maryland";
		String st1= "the snow have started in maryland";
		
		System.out.println(st.length());
		
		System.out.println(st.charAt(4));
		//System.out.println(st.charAt(34));//StringIndexOutOfBoundsException
		
		//to find indexof any any character
		System.out.println(st.indexOf('s'));// 4 first s
		System.out.println(st.indexOf('s', 5));//14 this is hard coded
		System.out.println(st.indexOf('s')+1);
		System.out.println((st.indexOf('s')+1)+1);
		
		// homework to find 3rd value
		
		System.out.println(st.indexOf('a'));
		System.out.println(st.indexOf('a')+1);
		
		System.out.println(st.indexOf('a', 12));
		
		
		System.out.println(st.indexOf("Maryland"));
		System.out.println(st.indexOf("maryland"));// -1 bc case sensitive
		// java is case sensitive
		System.out.println(st.indexOf("New York"));//-1 bc thats the way index of build
		//return type index OF is int= if no such value exist then it return -1
		
		 //to compare two string
		
		System.out.println(st.equals(st1));
		System.out.println(st.equalsIgnoreCase(st1));// its ignore cases not index
		
		// trim : remove before and after space
		
		String s1="      hi    ";
		System.out.println(s1);
		System.out.println(s1.trim());
		
		
		//Replace
		String time="12-00-03";
		System.out.println(time.replace("-", ":"));
		
		// substring:
		
		System.out.println(st.substring(0, 9));
		
		// split:return type of split is array tahts means it will return string array// , will be gone 
		
		String state="Taxes,Hawii,Florida,New York,Maryland";
		String usstate[]=state.split(",");
		for (int i=0;i<usstate.length;i++) {
		System.out.println(usstate[i]);
	}
	
	}
}
// String- collection of different character- it stores value based on index
// how to check the size of a string? 0 to 27 so size is 28; s.length () gives size of the string.
// s.length()  vs  length- this is String array
