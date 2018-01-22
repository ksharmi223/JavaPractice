package JavaPractice;

import java.util.ArrayList;

public class DinamicArray {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		
		ar.add(400);
		ar.add("New York");
		ar.add(500);
		ar.add(600);
		ar.add('S');
		
		System.out.println(ar.size());
		
		ar.add(700);
		ar.add(800);
		
		System.out.println(ar.size());
		
		ar.remove(5);
		System.out.println(ar.get(6));
		
		ar.add(4, 23);// to replace
		
		System.out.println(ar.size());// to get the size
		
		// to get all the value
		for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i));
		}
		
		//generaics:
		ArrayList<String> gn = new ArrayList<String>();
		gn.add("life");
		
		ArrayList<Integer> gn1 = new ArrayList<Integer>();
		gn1.add(900);
		
		
	}

}
