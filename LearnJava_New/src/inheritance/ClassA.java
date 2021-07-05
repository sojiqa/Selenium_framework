package inheritance;

public class ClassA {

	int a = 10;
	int b = 20;
	
	
	public void M1() {
	System.out.println("AM1");
			
	}
	
	public void M2() {
		System.out.println("AM2");
				
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ClassA obja= new ClassA();
		System.out.println(+obja.a + " : " + obja.b); // (objb.a + " : " objb.b); cannot call subclass methods using super object so objb.a will not work
		obja.M1();
		obja.M2();*/
		//obja.M3(); error showing for this
		
		ClassA objA= new ClassB();
		//System.out.println(objb.a + " : " objb.b); 
		objA.M1();
		objA.M2();
		
		
	}

}
