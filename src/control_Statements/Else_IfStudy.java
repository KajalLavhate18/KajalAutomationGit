package control_Statements;

public class Else_IfStudy {

	public static void main(String[] args) {
		// if marks >=60---->You are in dist
		//elseif marks>=50---->You are in 1st class
		//elseif marks>=40---->You are pass
		//else you are fail
		int marks =55;
		if (marks >=60)
		{
			System.out.println("You are in dist");
		}
		else if (marks>=50)
		{
			System.out.println("You are in 1st class");
		}
		else if(marks>=40)
		{
			System.out.println("You are pass");
		}
		else if(marks<=40)
		{
			System.out.println("You are fail");
		}
	//	else
		//{
		//	System.out.println("you are fail");
		//}
	}

}
