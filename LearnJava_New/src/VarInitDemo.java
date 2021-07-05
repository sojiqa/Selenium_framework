
public class VarInitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x;
for (x= 0; x < 4; x++) {
	int y= -1; // y is initialized each time block is entered
	System.out.println("y is: " + y);// this always print -1
	y=100;
	System.out.println("y is now: " + y);
	System.out.println("x is now " + x);
	
}
	}

}
