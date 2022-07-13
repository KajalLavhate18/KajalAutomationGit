package InheritanceStudy;

public class HierachicalInheritance {

	public static void main(String[] args) {
		// created object of sub class can call properties of super class and its own
		
		Doughter1 D1=new Doughter1();
		D1.emotions();
		D1.jewl();
		D1.key();
		D1.money();
		//created object of sub class can call properties of super class and its own class
		Son1 S1=new Son1();
		S1.key();
		S1.bike();
		S1.money();
		// created object of super class can call properties of super class only
		Mother1 M1=new Mother1();
		M1.key();
		M1.money();
		
	}

}
