/**Lab1 
 * Name: Prachi Anil Biradar
 * Date:18/03/2021
 * Program to find if given number is power of .
 *
 *
 */import java.util.Scanner;

public class PowerofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(checkNumber(num));
		
	}

	private static boolean checkNumber(int num) {
		while(num>1)
		{
			if(num%2==0)
			{
				num=num/2;
				continue;
			}
			else
			{
				return false;
			}
			
		}
		return true;
	}

}
