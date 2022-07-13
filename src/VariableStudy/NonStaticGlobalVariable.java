package VariableStudy;

public class NonStaticGlobalVariable {
	 static int b=50;

	public static void main(String[] args) {
		NonStaticGlobalVariable NSG=new NonStaticGlobalVariable();
		System.out.println("value of b is"+NSG.b);//non static global for same class
		
		StaticDiffClass SD=new StaticDiffClass();
		
		System.out.println("value of y is "+SD.y);//non static for another class
		
	}

}
