package OopsExamples;

import java.util.Scanner;

public class BankTransaction {

	public static void main(String[] args) 
	{
	long withdraw,accbalance;
	int accno;
	String holdername;
	
	
	Scanner sc=new Scanner(System.in);
	
	
	
	System.out.println("Enter the acount no");	
	accno=sc.nextInt();
	
	System.out.println("Enter the accholder name");
     
	holdername=sc.next();

	

	System.out.println("Enter balance");
	accbalance=sc.nextLong();
	
Bank yugandhar=new Bank(accno,holdername,accbalance);
	
	System.out.println("Enter the amount to withdraw");
	withdraw	=sc.nextLong();
	yugandhar.withdraw(withdraw);
	yugandhar.checkbalance();
	
	
	
		

	}

}
