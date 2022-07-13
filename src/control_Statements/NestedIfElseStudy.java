package control_Statements;

public class NestedIfElseStudy {

	public static void main(String[] args) {
		//if UN is valid---->enter PWD
		//if PWD is valid --->login success
		//else PWD is invalid ---->incorrect pwd
		//else UNis invalid--->incorrect UN
		String UN="velocity";
		String PWD="Velocity@123";
		if(UN=="velocity")//outer loop
		{
			System.out.println("Enter password");
			if (PWD=="Velocity@123")
			{
				System.out.println("login success");
			}
			else
			{
				System.out.println("incorrect PWD");
			}
		}
		else
		{
			System.out.println("incorrect UN");
		}

	}

}
