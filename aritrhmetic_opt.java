import java.util.Scanner;

public class aritrhmetic_opt {

	public static void main(String[] args) {
		 int no1,no2,add,sub,mul,div;
		    double mod;
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter 1st no.");
			no1=sc.nextInt();
			System.out.println("enter 2nd no.");
			no2=sc.nextInt();
			add=no1+no2;
			sub=no1-no2;
			mul=no1*no2;
			div=no1/no2;
			mod=no1%no2;
			System.out.println("addition is ="+add);
		    System.out.println("substraction is ="+sub);
		    System.out.println("multiplication is ="+mul);
			System.out.println("division of is ="+div);
			System.out.println("modulus of is ="+mod);

	}

}
