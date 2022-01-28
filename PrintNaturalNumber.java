package basicprograms;

import java.util.Scanner;

public class PrintNaturalNumber {

	public static void main(String[] args) {
		
		int i, n;
       
		System.out.println("enter the range of natural number");
		Scanner  sc=new Scanner(System.in);
		n=sc.nextInt();
		 for(i=1;i<=n;i++)
		 { 
			 System.out.println(i);
		 }
	}

}
