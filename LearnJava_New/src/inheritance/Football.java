package inheritance;

public class Football extends Sports {
@Override

  String getName()
	{ return "Football";
  
	}
 

	void getNumberOfTeamMembers() {
		System.out.println("Each team has 11 players in " + getName());
	}
	
	public static void main(String[] args) {
		
		Football obj = new Football();
		String sportsName= obj.getName();
		System.out.println("Sport is : " + sportsName + "\n");
		obj.getNumberOfTeamMembers();
	}

}
