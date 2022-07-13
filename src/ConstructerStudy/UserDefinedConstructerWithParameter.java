package ConstructerStudy;

public class UserDefinedConstructerWithParameter {
	int x,y,z;

	public static void main(String[] args) {
		UserDefinedConstructerWithParameter UDCP=new UserDefinedConstructerWithParameter();
		UDCP.sub();
		

	}
	public UserDefinedConstructerWithParameter()
	{
		x=50;
		y=40;
		z=30;
		
	}
	public void sub()
	{
		System.out.println(x-y);
		
	}

}
