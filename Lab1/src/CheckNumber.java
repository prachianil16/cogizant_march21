import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(checkNumber(num));
		

	}

	private static boolean checkNumber(int num) {
		// TODO Auto-generated method stub
		
		int lastDigit1=num%10;
		int lastDigit2=(num/10)%10;
		while(num>0)
		{
			
			if(lastDigit2<=lastDigit1)
				{
				lastDigit1=lastDigit2;
				num=num/10;
				lastDigit2=num%10;
			
				}
			else
			{
				return false;
			}
			
			
		}
		return true ;
	}

}
