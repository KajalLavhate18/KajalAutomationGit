package ConstructerStudy;

public class DefaultConstructer {
	

	public static void main(String[] args) {
		DefaultConstructer DC=new DefaultConstructer();
		DC.add(30, 20);
		
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}

}
