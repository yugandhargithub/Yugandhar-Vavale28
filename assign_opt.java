import java.util.Scanner;

public class assign_opt {

	public static void main(String[] args) {
		 int n1,n2;
	     System.out.println("Enterb two numbers- \n");
	     Scanner sc= new Scanner(System.in);
	     n1=sc.nextInt();
	     n2=sc.nextInt();
	     n2+=n1;
	     System.out.println(" value of n2+=n1 is ="+n2);
	      n2-=n1;
	     System.out.println("\n value of n2-=n1 is ="+n2);
	      n2*=n1;
	     System.out.println("\n value of n2*=n1 is ="+n2);
	       n2/=n1;
	     System.out.println("\n value of n2/=n1 is ="+n2);
	       n2%=n1;
	     System.out.println("\n value of n2%=n1 is ="+n2);	

	}

}
