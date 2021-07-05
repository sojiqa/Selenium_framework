package learnVariables;

public class Mortgage {

	float myRate;
	String myName;
	int myAge;
	int myYears;
	
	public Mortgage() {
		System.out.println("This is the Mortgage Calculator");
	}
	
	public Mortgage(float myRate) {
		
	}

	public Mortgage(String myName) {
		
	}

	public Mortgage(int myAge, int myYears) {
		
	}
	
		public void GetMortgage() {
		
		myRate= 5.4f;
		myName= "Frank Jackson";
		myAge= 40;
		myYears=40;
		
		if (myAge < myYears)
			System.out.println("Morgage Approved for " + myName + " at a rate of " + myRate);
		
		else if (myAge>myYears)
			System.out.println("Morgage Not approved for " + myName  );
		
		else if (myAge==myYears)
			System.out.println("Morgage  under consideration for " + myName + " at a rate of " + myRate);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mortgage cal = new Mortgage();
		cal.GetMortgage();
		
	}

}
