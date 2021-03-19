/**Lab1 
 * Name: Prachi Anil Biradar
 * Date:18/03/2021
 * Program to find the fibonacci number.
 *
 *
 */
import java.util.Scanner;
import java.io.*;
public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int num1=0, num2=1;
		fibonacci(num1,num2,num);
}

	private static void fibonacci(int num1, int num2, int num) {
		int num3=0;
		
		for(int i=2; i<=num; i++)
		{
			num3= num1+num2;
			num1=num2;
			num2=num3;
		}
		System.out.println(num3);
	}
		// TODO Auto-generated method stub
		
		
	}
