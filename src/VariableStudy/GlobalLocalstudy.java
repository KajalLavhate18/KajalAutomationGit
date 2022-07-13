package VariableStudy;

public class GlobalLocalstudy {
	int a=20;
	static int b=30;

	public static void main(String[] args) {
		
		GlobalLocalstudy GL=new GlobalLocalstudy();
		System.out.println("value of a is"+GL.a);
		System.out.println("value of b is"+b);
		
		//calling static local variable from same class
		test2();
		//calling non static variable from same class
		GL.test1();
		
		//calling global variable from another class
		GlobalLocalVariableStudy1 gl1=new GlobalLocalVariableStudy1();
		System.out.println("value of m is"+gl1.m);
		System.out.println("value of n is"+GlobalLocalVariableStudy1.n);
		//calling local variable from another class
		gl1.display2();
		GlobalLocalVariableStudy1.display();
		

	}
	public void test1()
	{
		int x=50;
		
		System.out.println("value of x is"+x);
	}
	public static void test2()
	{
		int y=80;
		System.out.println("value of y is"+y);
		
	}

}
