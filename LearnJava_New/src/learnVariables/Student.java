package learnVariables;

public class Student {
public String sName;
public double mark;
public String grade;
public boolean passorfail;
	

public String sName() {
	return sName;	
}

public double mark() {
	return mark;
}
public String grade () {
	 
	return grade;	
}
public boolean passorfail() {
	boolean passorfail= true;
	boolean passorfail2= false;
	
	return passorfail;
	
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
Student stuOne = new Student ();
Student stuTwo= new Student ();

stuOne.sName ="John";
stuOne.mark = 78;
stuOne.grade= "B";
stuOne.passorfail= true;

stuTwo.sName= "Riri";
stuTwo.mark= 55;
stuTwo.grade= "D";
stuTwo.passorfail= false;

System.out.println(stuTwo.sName + " failed her exam with a score of " + stuTwo.mark);
	

	}

}
