import java.util.Arrays;

/**Lab2
 * NAME: Prachi Anil Biradar
 * Java program that can accept an array of String objects and sort in alphabetical order.
 * Date:18/10/2021
 *
 */
public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"Meera","Sita","Gita","Ram","Krishna","Shiva"};
		        
		arr = sortString(arr);
				
		for(String i : arr) {
			System.out.println(i);
		}
	}

	private static String[] sortString(String[] arr) {
				
		Arrays.sort(arr);
		return arr;
	}
	}


