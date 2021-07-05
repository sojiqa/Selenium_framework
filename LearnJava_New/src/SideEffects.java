
public class SideEffects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Side effects can be important
		
		int i;
		i=0;
		
		if (false & (++i < 100))
			System.out.println(" This won't be displayed");
		System.out.println(" if statement executed: "+ i ); //displays i
		
		//in the code below, i is not incremented because the short-circuit operator skips the increment.
		if (false && (++i < 100))
			System.out.println("this wont be displayed");
		System.out.println("if statement executed:" + i); // still i
		
		
	}

}
