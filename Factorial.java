import java.util.Scanner;

public class Factorial {

	public static void main(String args[])
	{
		int fac=1,a;
		System.out.println("Enter a number :");
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			fac=fac*i;
		}
		System.out.println("Factorial : "+fac);
	}
}
