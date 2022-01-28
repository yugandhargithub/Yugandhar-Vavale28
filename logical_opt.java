import java.util.Scanner;

public class logical_opt {

	public static void main(String[] args) {
		 int n1,n2,n3;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter three numbers");
         n1=sc.nextInt();
         n2=sc.nextInt();
         n3=sc.nextInt();
         System.out.println("logical && operator ="+(n1==n2 && n1!=n3));
         System.out.println("logical || operator ="+(n1==n2 || n1!=n3));
         System.out.println("logical ! operator ="+(!(n1==n3)));	

	}

}
