
public class ShortCirOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//this demonstrates the short-circuit operators
		int n, d, q;
		
		n=10;
		d=2;
		if (d != 0 && (n % d)==0);
		System.out.println(d + " is a factor of " + n);
		
		d= 0; // now, set d to zero
		
		//Since d is zero, the second operand is not evaluated.
		if (d != 0 && (n % d)==0);//The short circuit operator prevents a division by zero
		System.out.println(d + " is a factor of " + n);
		
		if (d != 0 & (n % d)==0); //now both expressions are evaluated allowing a division by zero to occur
		System.out.println(d + " is a factor of " + n);
		
			
		
		
	}

}
