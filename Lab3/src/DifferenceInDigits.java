/**Lab2
* Name: Prachi Anil Biradar
 * Date:19/03/2021
 * Java program to sort a string array in alphabetical order 
 * 
 *
 */
import java.util.Scanner;
public class DifferenceInDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		 System.out.println("Enter a number:");
		int num = s.nextInt();
		
		int d = modifyNumber(num);
		System.out.println(d);
	}
	
		public static int modifyNumber(int number1) {
			
			
			// Integer to String Conversion
			 
			String num = String.valueOf(number1);
			
			
			 // Conversion to String buffer
			 
			StringBuffer sb = new StringBuffer();
			
			char ch1 = num.charAt(0);
			char ch2 = num.charAt(1);
			
			for (int i = 2; i < num.length(); i++) {
				
				int diff = Math.abs((int) (ch1 - ch2));
				ch1 = ch2;
				ch2 = num.charAt(i);
				sb.append(diff);
			}
			sb.append(Math.abs((int) (num.charAt(num.length() - 2) - num.charAt(num.length() - 1))));
			sb.append(num.charAt(num.length() - 1));
			
			
			 // Conversion from String Buffer to integer
			 
			String str = sb.toString();
			int number = Integer.parseInt(str);
			return number;
			
		}
		
		
	

}
