package learnVariables;

public class GetWage {
int basesalary=30000;
int overtime= 20;
float rate= 5.4f;
String empname = "John Smith";


public GetWage() {
	float ans = (basesalary + (overtime * rate));
	System.out.println(empname + " is to earn "+ ans);
}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		GetWage er= new GetWage();
		er.GetWage();
	}




	private void GetWage() {
		// TODO Auto-generated method stub
		
	}

}
