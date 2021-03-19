/**Lab2
 * Name: Prachi Anil Biradar
 * Date:19/03/2021
 * Java program to find the sum of given input using string Tokenizer.
 *
 *
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class SumofIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			System.out.print("Enter a line of numbers: ");
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			StringTokenizer st = new StringTokenizer(input,"$");
			int sum = 0;
			while(st.hasMoreTokens())
			{
				int n = 0;
				n = Integer.parseInt(st.nextToken());
				System.out.println("Number is: "+n);
				sum += n;
			}
			System.out.println("Sum of the numbers is: "+sum);
	
	}

}
