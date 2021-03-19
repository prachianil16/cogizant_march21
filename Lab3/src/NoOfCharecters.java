/**Lab2
 * Name: Prachi Anil Biradar
 * Date:19/03/2021
 * Java program to find the no. of charecters, lines and words in given input. 
 * 
 *
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NoOfCharecters {
	 public static void main(String[] args)throws Exception
	    { 
	//String line=" Hello everyone. How are you guys doing? Hope everyone is fine.";
	InputStreamReader input = new InputStreamReader(System.in); 
	BufferedReader reader = new BufferedReader(input); 
    // Initializing counters 
	System.out.println("Enter a line:");
	String line=reader.readLine();
    int countWord = 0; 
    int sentenceCount = 0; 
    int characterCount = 0; 
    int whitespaceCount = 0; 
      
    // Reading line by line from the  
    // file until a null is returned 
    while((line = reader.readLine()) != null) 
    { 
        if(line.equals("")) 
        { 
            break; 
        } else { 
            characterCount += line.length(); 
              
            // \\s+ is the space delimiter in java 
            String[] wordList = line.split("\\s+"); 
              
            countWord += wordList.length; 
            whitespaceCount += countWord -1; 
              
            // [!?.:]+ is the sentence delimiter in java 
            String[] sentenceList = line.split("."); 
              
            sentenceCount += sentenceList.length; 
        } 
    } 
      
    System.out.println("Total word count = " + countWord); 
    System.out.println("Total number of sentences = " + sentenceCount); 
    System.out.println("Total number of characters = " + characterCount); 

    System.out.println("Total number of whitespaces = " + whitespaceCount); 
} 
}
