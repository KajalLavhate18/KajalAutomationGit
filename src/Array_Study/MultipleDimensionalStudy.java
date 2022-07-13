package Array_Study;

public class MultipleDimensionalStudy {

	public static void main(String[] args) {
		int runs[][]= {{30,40,60},{45,50,70},} ;//,{60,70,30},{90,80,72}};
		/*for(int  r=0;r<=1;r++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(runs[r][j]+" ");
			}
			System.out.println();
		}*/
	
	//dynamic coding
	
	for(int i=0;i<=runs.length-1;i++)
	{
		for(int j=0;j<=runs.length-1;j++)
		{
			System.out.print(runs[i][j]+" ");
			
		}
		System.out.println();
		
	}
	

}
}
