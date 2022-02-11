package OopsExamples;

class Bank
{

	
	int accno;
	String accholderName;
	long accbalance;
	
	
	public Bank(int accno,String holdername,long accbalance)
	
	{this.accno=accno;
	
	
	this.accholderName=holdername;
	this.accbalance=accbalance;
	}
	public void withdraw(long amount)
	
	{if((amount<accbalance)&&(amount>=500))
	{
		accbalance=accbalance-amount;
	System.out.println(amount+"withdraw has done successfully");
	}
	
	else
	{
		System.out.println("Insufficient balance!deposite first");
		
	
	}
	}
	public void checkbalance()
	{
	System.out.println("accont no:"+this.accno);
	System.out.println("accountholder"+this.accholderName);
	System.out.println("accountbalance"+this.accbalance);
	}
	}

	
	
	
	

