/**Lab2
 * *  * Name: Prachi Anil Biradar
 * Date:19/03/2021
 * Java program to find if given integer is Positive or Negative or even or odd or zero in the given array 
 
 *
 */
import java.util.Scanner;

public class TypesOfIntegers {

	public static void main(String[] args) {
		System.out.println("Enter 20 integers");
		int arr[]=new int[20];
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<20;i++)
		{
			arr[i] = sc.nextInt();

		}
		int positiveCount=0;
		int negativeCount=0;
		int oddCount=0;
		int evenCount=0;
		int zeroCount=0;
		for(int i=0;i<20;i++)
		{
			if(arr[i]<0)
				positiveCount+=1;
			else if(arr[i]>0)
				negativeCount+=1;
			
			if(arr[i]%2==0)
				evenCount+=1;
			else if(arr[i]%2!=0)
				oddCount+=1;
			if(arr[i]==0)
				zeroCount+=1;
		
			
		}
		System.out.println("Positive number count:"+positiveCount);
		System.out.println("Negative number count:"+negativeCount);
		System.out.println("Even number count:"+evenCount);
		System.out.println("Odd number count:"+oddCount);
		System.out.println("Zero number count:"+zeroCount);


	}

}
