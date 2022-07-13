package stringStudy;

public class stringStudy1 {

	public static void main(String[] args) {
		String name="Kajal"; //without using new keyword //store in constant pool area 
		String s1=new String ("name");//with mew keyword // store in non constant pool area
		
		System.out.println(name);
		System.out.println(s1);
		
		// String length method
		
		System.out.println(name.length());//only shows output
		System.out.println(s1.length());
		
		int a = name.length();//store value in reference variable
		System.out.println(a);
		int d = s1.length();
		System.out.println(d);
		
		
		//ToUppercase method
		
		System.out.println(name.toUpperCase());// upper case show
	 String b = name.toUpperCase(); // to store output in reference variable b
	 System.out.println(b);
	 System.out.println(s1.toUpperCase());
	 String e = s1.toUpperCase();
	 System.out.println(e);
	 
		//ToLowercase method
	 System.out.println(b.toLowerCase());
	 System.out.println(name.toLowerCase());
	 String c = b.toLowerCase();
	 System.out.println(c);
	 
	 
	 
		
	}

}
