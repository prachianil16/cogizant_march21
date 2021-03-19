/**Lab3
  * Name: Prachi Anil Biradar
 * Date:19/03/2021
 * Java program to find difference between current date and given input date 
 * 
 *
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DifferenceInDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Year");
		int yyyy = s.nextInt();
		System.out.println("Enter the Month");
		int mm = s.nextInt();
		System.out.println("Enter the Date");
		int dd = s.nextInt();
		
		/**
		 *  Start date 
		 */
		LocalDate start_date = LocalDate.of(yyyy, mm, dd); 

		/**
		 * Present date 
		 */
		LocalDate now 
			= LocalDate.now(); 

		findDifference(start_date, now); 
	

	}
	static void findDifference(LocalDate start_date, LocalDate now) 
	{ 

		/**
		 *  find the period between the start and end date 
		 */
		Period diff = Period.between(start_date, now); 

		System.out.print( "Difference between two dates is : "); 

		System.out.println(diff.getYears() + " Years, " + diff.getMonths() + " Months " + diff.getDays() + " Days"); 


}
}