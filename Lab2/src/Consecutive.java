/**Lab2
 * Name: Prachi Anil Biradar
 * Date:18/03/2021
 * Java program to find longest consecutive numbers and its length in the given array 
 * 
 *
 */
import java.util.HashSet;



public class Consecutive {

	public static void main(String[] args) {
	
			   
	        int nums[] = {99, 1, 3, 600, 2, 4, 5,90};  
	        
			System.out.println("\nThe new length of the array is: "+longest_sequence(nums));
				
	    }
	    
	    public static int longest_sequence(int[] nums) {
	      final HashSet<Integer> h_set = new HashSet<Integer>();
	        for (int i : nums) h_set.add(i);

	        int longest_sequence_len = 0;
	        for (int i : nums) {
	            int length = 1;
	            for (int j = i - 1; h_set.contains(j); --j) {
	                h_set.remove(j);
	                ++length;
	            }
	            for (int j = i + 1; h_set.contains(j); ++j) {
	                h_set.remove(j);
	                ++length;
	            }
	            longest_sequence_len = Math.max(longest_sequence_len, length);
	        }
	        return longest_sequence_len;
	    }
	}


