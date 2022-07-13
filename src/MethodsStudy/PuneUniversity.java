package MethodsStudy;

public class PuneUniversity {

	public static void main(String[] args) {
		PuneUniversity PU = new PuneUniversity();//created of an object
		PU.StudentInfo();//calling non static method from same class without parameter
		PU.StudentInfo("Tejal","PU45621","bcom",4,'B');//calling method with parameter
		PU.StudentInfo("Swapnil","PU25987","BE",2,'C');
		PU.StudentInfo("Rushi","PU647892","DME",3,'A');
		
		
		
		
		
		
	}
	public void StudentInfo()//non static regular method without parameter
	{
		//Name,PRN,Course,Year,Grade
		String Name="kajal";
		String PRN="SPPU1234";
		String Course="ENGG";
		int Year=4;
		char grade='A';
		System.out.println("===================");
		
		System.out.println("Students name is "+Name);
		System.out.println("Students PRN NUMBER is "+PRN);
		System.out.println("students course is "+Course);
		System.out.println("students year is "+Year);
		System.out.println("students grade is "+grade );
		System.out.println("==================");
		
		
		
	}
	
	
	
	public void StudentInfo(String Name,String PRN,String Course,int Year,char grade)//method with parameter
	{
		        System.out.println("================================");
		        System.out.println("Students name is "+Name);
				System.out.println("Students PRN NUMBER is "+PRN);
				System.out.println("students course is "+Course);
				System.out.println("students year is "+Year);
				System.out.println("students grade is "+grade );
				System.out.println("=======================");
	
		
		
		
		
	}

}
