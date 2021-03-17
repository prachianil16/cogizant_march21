import java.util.Scanner;

public class SquareDifference {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Difference: "+calculateDifference(n));


	}

	private static int calculateDifference(int n) {
		// TODO Auto-generated method stub
		int difference = 0;
		int sum= 0;
		int squareSum= 0;
		for (int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		for (int i=1;i<=n;i++)
		{
			squareSum=squareSum+i*i;
		}
		difference=squareSum-sum*sum;
		
		return difference;
	}

}
