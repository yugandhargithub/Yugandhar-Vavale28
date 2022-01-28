import java.util.Scanner;

public class bitwise_opt {

	public static void main(String[] args) {
	 
			 int n1,n2;
	         Scanner sc=new Scanner(System.in);
	         System.out.println("enter two numbers");
	         n1=sc.nextInt();
	         n2=sc.nextInt();

	         System.out.println("betwise & operator ="+(n1&n2));
	         System.out.println("betwise ^ operator ="+((n1^n2)));
	         System.out.println("betwise  |  operator ="+(n1|n2));	

	}

}
