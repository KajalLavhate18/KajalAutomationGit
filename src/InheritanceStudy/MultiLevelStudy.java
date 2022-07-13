package InheritanceStudy;

public class MultiLevelStudy {

	public static void main(String[] args) {
		
		
		
		
		// object of sub class can call all properties of super most class ,super class and its own class
		
		son S=new son();
		
		S.laptop();//properties of its own class
		
		S.home();// properties of super class
		
		S.experience();//properties of super most class
		
		S.stories();//properties of super most class
		System.out.println("==========================");
		
		// created  an object of superclass can call properties of super most class and super class
		
		Father F=new Father();
		
		F.home();//properties of its own class
		F.experience();//properties of super most class
		F.stories();//properties of super most class
		
		System.out.println("=======================");
		// created an object of super most class can call properties of its own class only
		
		GrandFather GF=new GrandFather();
		
		GF.experience();//properties of super most class
		
		GF.stories();//can call its own properties only
		
	}

}
