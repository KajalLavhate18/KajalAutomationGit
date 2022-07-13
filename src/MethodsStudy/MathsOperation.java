package MethodsStudy;

public class MathsOperation {

	private static MathsOperation MO;

	public static void main(String[] args) {
		//calling method from same class
		MathsOperation.MO=new MathsOperation(); //created the object of same class
		add();//calling static method from same class
		MO.sub(); //calling non static method from same class
		//calling method from another class
		Test1 T=new Test1(); //created object of another class
		Test1.mul();// calling static method from another class
		T.div();// calling non static method from another class
		
		
	
	}
	
	  public static void add()//static regular method
	  {
	  int a=23;
	  int b=15;
	  int sum=a+b;
	  System.out.println("sum is "+sum);
	  System.out.println("======================");
	  }
	  
	  public void sub() //non static regular method
	  {
	  int a=50;
	  int b=30;
	  int subs=a-b;
	  System.out.println("Sub is "+subs);
	  System.out.println("=======================");
	  
	  
	  
			  
	  }
	  
}
    
