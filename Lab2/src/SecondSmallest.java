/**Lab2
 *  * Name: Prachi Anil Biradar
 * Date:18/03/2021
 * Java program to find second smallest number in the given array 
 * 
 *
 */import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 10 integers");
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			arr[i] = sc.nextInt();

		}
		findSecondSmallest(arr);
		
		
	}

	private static void findSecondSmallest(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		System.out.println("Second smallest number in the array is:"+arr[1]);
	}

}
