/**Lab2
 * Name: Prachi Anil Biradar
 * Date:19/03/2021
 * Java program to mirror a string 
 *
 *
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MirrorString {

	public static void main(String args[])throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);  
	    System.out.println("Enter the string to be mirrored");    
	    String word=br.readLine(); 
	    StringBuffer revWord=new StringBuffer(word);
	    revWord.reverse();
	    System.out.println(word+"|"+revWord);
	}

}
