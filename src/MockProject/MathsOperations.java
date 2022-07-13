package MockProject;

public class MathsOperations {

	public static void main(String[] args) {
		MathsOperations MO=new MathsOperations();
		MO.add(20, 25);
		MO.sub(35, 20);
		MO.mul(40, 20);
		MO.div(60, 30);
		

	}
	public void add(int a,int b)
	{
		
		System.out.println(a+b);
		System.out.println("=============");
		
	}
	public void sub(int a,int b)
	{
		System.out.println(a-b);
		
		System.out.println("===============");
		
	}
	public void mul(int a,int b)
	{
		System.out.println(a*b);
		
		System.out.println("==============");
	}
	public void div(int a,int b)
	{
		System.out.println(a/b);
		
		System.out.println("================");
	}

}
