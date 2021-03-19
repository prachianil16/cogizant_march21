/**Lab2
 * Name: Prachi Anil Biradar
 * Date:19/03/2021
 * Java program to find if a string is in alphabetical order-"Positive" or "Negative" 
 * 
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class PostiveString {
	
      
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		if (isAlphabaticOrder(s))  
	           System.out.println("Positive String");  
	        else
	            System.out.println("Negative String");
	}
	public static boolean isAlphabaticOrder(String s)  
    {  
       
        int n = s.length();  
        
        char c[] = new char [n];  
      
        for (int i = 0; i < n; i++) {  
            c[i] = s.charAt(i);  
        }  
       
        Arrays.sort(c);  
        
     
        for (int i = 0; i < n; i++)  
            if (c[i] != s.charAt(i))   
                return false;  
                
        return true;      
    }  

}
