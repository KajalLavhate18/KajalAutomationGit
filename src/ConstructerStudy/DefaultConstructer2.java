package ConstructerStudy;

public class DefaultConstructer2 {

	public static void main(String[] args) {
		DefaultConstructer2 DC2=new DefaultConstructer2();
		DC2.display();
		

	}
	public void display()
	{
		int a=5;
		int b=6;
		int mul=a*b;
		System.out.println("I am display method "+mul);
	}

}
