package ExceptionHandaling;

import java.util.Scanner;

public class Exceptiondemo {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		
		//ArithmeticException
		System.out.println("Enter 1st value");
		a=sc.nextInt();

		System.out.println("Enter 2nd value");
		b=sc.nextInt();
		
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
				//or
			System.out.println("Exception occurs");
				//or
			e.printStackTrace();
		}

		
		//NullPointerException
		String s = null;
		
		try 
		{

			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{

			System.out.println("Exception occurs:"+ e);
		}
	
		//NumberFormatException
		int num;
		String o ="abc";
		try
		{
			num = Integer.parseInt(o);
			System.out.println(num+"\n");
		}
		catch(NumberFormatException n)
		{
			System.out.println("Exception occurs:");
		}
		
		//ArrayIndexOutOfBoundsException
		int arr[]=new int[5];
		
		try
		{
			arr[10]=50;
			System.out.println(arr+"\n");
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("Exception occurs:");
		}
		
		System.out.println("End Code");
			
	}

}
