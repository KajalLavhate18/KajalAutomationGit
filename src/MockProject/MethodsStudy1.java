package MockProject;

public class MethodsStudy1 {

	public static void main(String[] args) {
		//calling static method from same class
		MyMethod(); //static method from same class
		
		//calling nonstatic regular method from same class
		MethodsStudy1 MS= new MethodsStudy1();// created object for non static regular method
		MS.test();//calling non static regular method
		
		//calling static regular method from another class
		MethodsStudy2 .Nilesh();
		//create an object
		MethodsStudy2 MS2=new MethodsStudy2();
		MS2.Nilesh1();
		
		

	}
	public static void MyMethod()//static regular method
	{
		System.out.println("i'm static regular method");
	}
	public void test()// non static regular method
	{
		System.out.println("I'm non static regular method");
	}

}
