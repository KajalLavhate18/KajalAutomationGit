package String_Study;

public class StringUse1 {

	public static void main(String[] args) {
		String name="Velocity";//without using new keyword
		String city=new String("Pune");//using new keyword
		
		
		//lenght() method use
		
		System.out.println(name.length());
		System.out.println(city.length());
		
		int a = name.length();
	    int b = city.length();
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("======================");
		
		// toUpperCase
		String a1="Velocity";
		System.out.println(a1.toUpperCase());
		 String b1 = a1.toUpperCase();
		 System.out.println(b1);
		 System.out.println("=====================");
		 
		 // toLowerCase
		 
		 String d ="VELOCITY";
		 System.out.println(d.toLowerCase());
		 String d1 = d.toLowerCase();
		 System.out.println(d1);
		  System.out.println("====================");
		  
		  // to equal method
		  
		  String e="Kajal";
		  String e1="Kajal";
		  String e2="kajal";
		  System.out.println();
		  
		  
		  System.out.println(e.equals(e1));
		  System.out.println(e1.equals(e2));
		  System.out.println(e2.equals(e));
		  
		  System.out.println("======================");
		  
		  
		  
		  
		  
		  
		  
		  
		
		
		
		
		

	}

}
