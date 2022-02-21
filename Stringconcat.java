package StringHandaling;

public class Stringconcat {

	public static void main(String[] args) {

		
		String s1="Java String";
		s1.concat("Is immutable");
		
		System.out.print(s1);
		s1=s1.concat(" is immutable");
		System.out.print("\n"+s1);	
		
	
	
	

		String s3="Java String";
		String s2="Is immutable";
		
		System.out.print("\n"+s3);
		s3=s3.concat(" "+s2);
		System.out.print("\n"+s3);
		
	
	}

}
