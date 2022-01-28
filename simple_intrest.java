import java.util.Scanner;

public class simple_intrest {

	public static void main(String[] args)
	{
		 double p,t,r,si;
	     System.out.println("enter principle of amount ");
	     Scanner sc=new Scanner(System.in);
	     p=sc.nextDouble();
	     System.out.println("\nenter rate ");
	     r=sc.nextDouble();
	     System.out.println("\nenter time  ");
	     t=sc.nextDouble();
	     si=(p*r*t)/100;
	     System.out.println("simple interest is = "+si);
}
}