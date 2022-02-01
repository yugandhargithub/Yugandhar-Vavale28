package basicprograms;

import java.util.Scanner;

public class sumofnaturalnumber {

	public static void main(String[] args)
	{
		int num,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		num=sc.nextInt();
		
		for(i=1;i<=num;i++)
		{sum=sum+i;
		
		}
		System.out.println("sum of natural number from 1to "+num+"is="+sum);
		
	
	}

}
