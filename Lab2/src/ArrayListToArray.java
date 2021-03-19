/**Lab2
 * Name: Prachi Anil Biradar
 * Date:18/03/2021
 * Java program to convert ArrayList to array. 
 * 
 *
 */
import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(); 
        list.add(10); 
        list.add(20); 
        list.add(30); 
        list.add(40); 
        System.out.println(list);
	
        Object[] objects = list.toArray(); 
  
        // Printing array of objects 
        for (Object obj : objects) 
            System.out.print(obj + " ");
	}

}
