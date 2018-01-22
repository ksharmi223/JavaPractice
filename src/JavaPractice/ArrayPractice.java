package JavaPractice;

public class ArrayPractice {

	public static void main(String[] args) {
		
		int i []=new int [7];
		i[0]=5;
		i[1]=15;
		i[2]=25;
		i[3]=35;
		i[4]=45;
		i[5]=55;
		i[6]=65;
		System.out.println("The size of the array is:" +i.length);
		
		for(int x=0;x<i.length;x++) {// x<i can't be x<= i then we will get ArrayIndexoutofException-
									//x can't be same as size since index start with 0.
			System.out.println(i[x]);
		}
		System.out.println("*******************");
		String tab[]=new String [4];
		tab[0]="Home";
		tab[1]="Kid";
		tab[2]="Women";
		tab[3]="Men";
		System.out.println("The size of the array is :" +tab.length);
		for(int t=0;t<tab.length;t++) {
			System.out.println(tab[t]);
			}
		System.out.println("**********************");
		Object obj[]=new Object[5];
		obj[0]='I';
		obj[1]=" wake";
		obj[2]=" up";
		obj[3]=" at";
		obj[4]= 7;
		System.out.println("The size of the array is:" +obj.length);
		for(int s=0;s<obj.length;s++) {
			System.out.print(obj[s]);
			
		
	}	
	}

}
