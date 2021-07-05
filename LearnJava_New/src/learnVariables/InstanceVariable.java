package learnVariables;

public class InstanceVariable {
public double speed;
int horsepower;


public InstanceVariable ()
{
	System.out.println("Hello...");
}

public InstanceVariable (double getSpeed) {
	
	return;
}
public InstanceVariable(int getHp) {
	return;
}

public void getvalues() {
	
	speed =100;
	horsepower=6;
	System.out.println("John was caught speeding at " + speed + " miles per hour in a ferrari with " +horsepower + " horsepower engine.");
	
}




public static void main(String[] args) {
		// TODO Auto-generated method stub
 InstanceVariable cv = new InstanceVariable();
 cv.getvalues();
 
 	
	}

}










