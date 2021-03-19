/**Lab1 
 * Name: Prachi Anil Biradar
 * Date:18/03/2021
 * Program to find the sum of the cubes of the digits of an n digit number.
 * 
 *
 */
 
import java.util.Scanner;
import java.io.*;
public class DigitCube {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		CalculateCube(num);
		// TODO Auto-generated method stub

	}

	private static void CalculateCube(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		while(num>0)
		{	
			int num2 = num%10;
			sum = sum+num2*num2*num2;
			num = num/10;
			num2 = 0;
		}
		System.out.println("Cube of digits of number is :"+sum);
	}

}
