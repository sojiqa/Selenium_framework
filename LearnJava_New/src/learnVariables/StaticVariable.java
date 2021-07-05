package learnVariables;

public class StaticVariable {
static int count =10;

public void incr() {
	count++;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticVariable obj1= new StaticVariable ();
StaticVariable obj2= new StaticVariable ();
obj1.incr();
System.out.println(obj1.count);
System.out.println(obj2.count);
	}

}
