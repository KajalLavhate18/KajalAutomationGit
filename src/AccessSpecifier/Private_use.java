package AccessSpecifier;

public class Private_use {
	int a=20;
	private int b=30;
	public int c=40;
	protected  static int d= 50;

	public static void main(String[] args) {
		Private_use u=new Private_use();
		u.add();//calling private method ----->allowed only within class
		u.mul();//calling default method-----> allowed within package
		display(); //calling protected method ---->allowed in  other package (use inheritance)
		u.sub();//calling public method ---->allowed within project
		
		System.out.println("value of a is "+u.a);
		System.out.println("value of b is "+u.b);
		System.out.println("value of c is "+u.c);
		System.out.println("value of d is "+Private_use.d);
		
		
		
		
	}
	private void add()// access specifier private
	{
		int a,b=10;c=25;
		a=b+c;
		System.out.println("value of a is"+a);
	}
	void mul() // access specifier default
	{
		int a,b=20,c=30;
		a=b*c;
		System.out.println("value of a is"+a);
	}
	protected static void display()// access specifier protected
	{
		System.out.println("hii i am protected method");
	}
	public void sub()//access specifier public
	{
		int a,b=55;c=40;
		a=b-c;
		System.out.println("value of a is a"+a);
		
	}

}
