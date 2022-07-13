package VariableStudy;

public class MathsOperationGlobalAndLocalVariable {
	static int a=20;
	int b=10;
	
	

	public static void main(String[] args) {
		MathsOperationGlobalAndLocalVariable MO=new MathsOperationGlobalAndLocalVariable();
		
	int adds=a+MO.b;
		System.out.println("addition is "+adds);
		MathsOperationGlobalAndLocalVariable MOG=new MathsOperationGlobalAndLocalVariable();
		MOG.add();
		int sub=a-MO.b;
		System.out.println("sub is "+sub);
		int div=a/MO.b;
		System.out.println("div is "+div);
		
		
		int sum=a+NonStaticGlobalVariable.b;
		System.out.println("addition is "+sum);
		StaticDiffClass SD=new StaticDiffClass();
		int sum1=MO.b+SD.y;
		System.out.println("sum1 is "+sum1);
		
		
		
		
		
		
		
		
		
	}
	public void add()
	{
		int c=30;
		int sum=c+20;
		System.out.println("addition is "+sum);

		
	}

}
