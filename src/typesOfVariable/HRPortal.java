package typesOfVariable;

public class HRPortal {

	public static void main(String[] args) {
		
		Employee SachinT=new Employee();//created an object
		SachinT.emp_name="Sachin Tendulkar";
		SachinT.emp_dept="Batting";
		SachinT.emp_id=10;
		SachinT.emp_sal=2503.245f;
		SachinT.emp_grade='A';
		
		
		Employee Dhoni=new Employee();//created an object
		Dhoni.emp_name="MSD";
		Dhoni.emp_id=7;
		Dhoni.emp_dept="Skipper";
		Dhoni.emp_sal=551245.252f;
		Dhoni.emp_grade='A';
		
		Employee ViratK=new Employee(); //created an object 
		ViratK.emp_name="Virat";
		ViratK.emp_id=18;
		ViratK.emp_dept="Batting";
		ViratK.emp_sal=56865.454f;
		ViratK.emp_grade='A';
		
		SachinT.emp_info();
		Dhoni.emp_info();
		ViratK.emp_info();
		
	}

}
