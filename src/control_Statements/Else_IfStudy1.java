package control_Statements;

public class Else_IfStudy1 {

	public static void main(String[] args) {
		int marks=58;
		if(marks>=50 & marks<100)
		{
			System.out.println("YOu are in dist");
		}
		else if(marks >=40 & marks<50)
		{
			System.out.println("You are in 1st class");
		}
		else if (marks >100)
		{
			System.out.println("Invalid marks range ,please enter valid value between 0-100");
		}
		else
		{
			System.out.println("YOu are fail");
		}
	}

}
