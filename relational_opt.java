import java.util.Scanner;

public class relational_opt {

	public static void main(String[] args)
	{
		
		int n1,n2;
		//boolean a=true,b=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("n1 is greater than n2 ="+(n1>n2));
        System.out.println("n1 is less than n2 ="+(n1<n2));
        System.out.println("n1 is greater than or equal to n2 ="+(n1>=n2));
        System.out.println("n1 is less than or equal to n2 ="+(n1<=n2));
        System.out.println("n1 is  equal to n2 ="+(n1==n2));
	}

}
