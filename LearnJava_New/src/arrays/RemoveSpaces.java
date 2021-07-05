package arrays;

public class RemoveSpaces {
	
	public void removeLeadingTrailingSpaces()
	{
		String []countryName= {" Costa Rica", "Denmark ","United State of America",  " France ",  "  Iceland   "};
		String[] trimmedArray = new String[countryName.length];
		
		for(int i=0; i< countryName.length; i++)
		{
			trimmedArray[i] = countryName[i].trim();
			System.out.println(trimmedArray[i]);
			
		}
	}
	
	public static void main(String[] args) {
		RemoveSpaces removeSpace= new RemoveSpaces();
		removeSpace.removeLeadingTrailingSpaces();
	}

}
