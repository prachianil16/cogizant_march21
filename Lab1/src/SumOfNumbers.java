import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Sum of Number divisible by 3 or 5: "+calculateSum(n));

	}

	private static int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
			
		}
		
		return sum;
	}

}
