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
//ArryList is a Class:
// Static Array: size is fixed- if you we want to store more than the size than give arrayIndexoutOfBoundsException
// Dynamic Array means size should be adjusted automatically-user should not worry about size.
// ArrayLIst- is default class support dynamic array.
// How to create the object of arrayList-with new keyword
//In Arraylist use add method to store information- we can store different type of data type 
// to find the side we need to use the size() method.
// Arraylist store the size based on index. So start with 0- here we don't need to define any size- we can store end number of value and size will define by Java
// There is get () with index will give the value// if we want to get more than the size we can IndexOUtOfBound Exception

//raw type array- mean we can store any type value- we should define the generic- is the term where we have define what kind of data we will store

// to print all the value in the Arrylist: we have to use for loop because arrayList also store the value based on indexes.

//

