package inheritance;

public class ClassB extends ClassA{

	int a = 30;
	int b = 40;
	
	
	public void M1() {
	System.out.println("BM1");
			
	}
	
	public void M3() {
		System.out.println("BM3");
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	ClassB objb= new ClassB();
		
		System.out.println(objb.a + " : " + objb.b);
		objb.M1();
		objb.M2();
		objb.M3();
		*/
		
		ClassA objB= new ClassB();
		System.out.println(objB.a + " : " + objB.b);
		objB.M1();
		objB.M2();
		
		
		
	}
}