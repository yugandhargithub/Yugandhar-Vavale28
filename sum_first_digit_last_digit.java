import java.util.Scanner;

public class sum_first_digit_last_digit {

	public static void main(String[] args) 
	
	{int i, n, sum=0 ,first_digit=0, last_digit=0 ;
	 
Scanner  sc= new Scanner(System.in);
	 
System.out.println("Enter the number.");
n=sc.nextInt();

last_digit= n % 10;

while(n>=10)
{
	n = n/10;
}

first_digit= n;

sum = first_digit+last_digit;

System.out.println("Sum of first digit and last_digit "+first_digit+"+"+last_digit+"="+sum);
	
		
		
		
		

	}

}
