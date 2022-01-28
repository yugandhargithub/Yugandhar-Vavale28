import java.util.Scanner;

public class conditional_opt {

	public static void main(String[] args) {
		int n1,n2;
		boolean a=true,b=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers"); 
 
        n1=sc.nextInt();
        n2=sc.nextInt();
  
        System.out.println("conditional operator ="+((n1<n2)?a:b));


	}

}
