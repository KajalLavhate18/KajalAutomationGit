package ConstructerStudy;

public class UserDefinedConstructor {
	int a;
	int b;
	int c;
	
	public UserDefinedConstructor()
	{
		a=20;
		b=6;
		c=4;
		
	}

	public static void main(String[] args) {
		UserDefinedConstructor UDC=new UserDefinedConstructor();
		UDC.mul();
		

	}
	public void mul()
	{
		System.out.println(a*b*c);
	}

}
