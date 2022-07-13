package demopackage;

public class ParameterStudy {

	public static void main(String[] args) {
		//calling static method 
		CskTeam(); 
		//calling static method with parameter
		CskTeam("Rohit", 50, 5.9f, 45, "Opener", 1);
		
		CskTeam("Jaddu", 34, 6.1f, 12, "AllRounder", 6);
		
		CskTeam("Raina", 40, 5.8f, 15, "Batsman", 4);
		
		
	}
	
	public static void CskTeam() //static regular method without parameter
	{
		String Name="Dhoni";
		float age=35f;
		float height=6.2f;
		int jersyno=07;
		String Role="finisher";
		int position=5;
		
		
		System.out.println("Player name is "+Name);
		System.out.println("Age is "+age);
		System.out.println("height is "+height);
		System.out.println("jersy no is "+jersyno);
		
		System.out.println("Role is "+Role);
	
		System.out.println("position is "+position);
		System.out.println("========================");
	
		
	}
	
	public static void CskTeam(String Name, float age,float height,int jersyno,String Role,int position )//static regular method with parameter
	{
		System.out.println("======================");
		
		System.out.println("Player name is "+Name);
		System.out.println("Age is "+age);
		System.out.println("height is "+height);
		System.out.println("jersy no is "+jersyno);
		
		System.out.println("Role is "+Role);
	
		System.out.println("position is "+position);
		
		System.out.println("=========================");
		
		
	}
	

}
