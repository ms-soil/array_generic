package arr;

//import java.util.Arrays;

public class Main 
{

	public static void main(String[] args) 
	{

		int i = 0;
		
		// INTEGER LIST
		
		MyIntList intlist1 = new MyIntList();
		intlist1.add(999 ,i);
		
		System.out.println("intlist\nLength is: " + intlist1.list.length);
		System.out.println("Element 1 is " + intlist1.list[0] + "\n");
		
		// GENERIC LIST
		
		MyGenericList<String> genlist1 = new MyGenericList<String>(String.class);
		genlist1.add("Hallo" ,i);

		System.out.println("genlist\nLength is: " + genlist1.list.length);
		System.out.println("Element 1 is " + genlist1.list[0]);
		
	}

}
