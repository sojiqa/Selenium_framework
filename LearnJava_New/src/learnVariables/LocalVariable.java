package learnVariables;

//Data types are the data allowed in java

		// we have 8 primitive data types
				
		// int - is a whole number data types and stores up to 32 bits
		// example int myInt = 1000000000;
	
		
		// short - stores whole number but limited to 16 bits
		//short myShort = 2000;
				
		// long - stores whole number but up to 64 bit
		//long myLong = 3000;
				
		// Byte - stores whole numbers - 8 bit
		//byte myByte = 8;
				
		// Boolean stores true or false value
		//boolean myB = true;
				
		// Float is used for decimal number and stores 32 bit
		//float myFloat = 3.0f;
	
		
		// double stores decimal number and stores 64 bit
		//double myD = 3.00;
	
		// char which stores variable character
		//char myChar = 'e';
		
		
		//Non-primitive means advanced data types and the major is the String
		
	//	String myString = "example";
	
public class LocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int myAge = 35;
String myName= "Soj ";
String myPurpose= "To learn Automation using Selenium";
float myMRate= 4.0f;
double myCRate=9.99;
boolean mySStatus = true;

System.out.print(" My name is " + myName + "I am " + myAge + " I am here " + myPurpose + " My mortgage rate is " + myMRate + " My Credit card rate is " + myCRate);

System.out.println( " My current status are a millionair is " + mySStatus);

	}

}
