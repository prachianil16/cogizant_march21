/**Lab2
 * Name: Prachi Anil Biradar
 * Date:18/03/2021
 * Java program to finf if a given value is present in an array.
 * 
 *
 */
public class Contains_SpecificValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {5,3,10,5,7,4,9,11,1};
		int keyValue = 1;
		int check = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == keyValue) {
				check = 1;
			}
		}
		if (check == 1) {
			System.out.println(" Array CCONTAINS a Specific Value");
		}
		else {
			System.out.println(" Array DOES NOT CONTAIN a Specific Value");
		}
	}

}
