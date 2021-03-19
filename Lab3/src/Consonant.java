/**Lab3
 * *  * Name: Prachi Anil Biradar
 * Date:19/03/2021
 * Java program to change each consonent into succeeding letter in the given string
 *
 *
 */
import java.util.Scanner;

public class Consonant {

	public static void main(String[] args) {
		System.out.println("Enter string:");
		Scanner sc=new Scanner(System.in);
		String s = sc.next(); 
        System.out.println(replaceConsonants(s.toCharArray()));
	}
	static boolean isVowel(char ch) 
    { 
        if (ch != 'a' && ch != 'e' && ch != 'i'
                && ch != 'o' && ch != 'u'&&ch != 'A' && ch != 'E' && ch != 'I'
                && ch != 'O' && ch != 'U')  
        { 
            return false; 
        } 
        return true; 
    } 
 
    static String replaceConsonants(char[] s)  
    { 

        for (int i = 0; i < s.length; i++) 
        { 
            if (!isVowel(s[i])) 
            { 
  
                if (s[i] == 'z')  
                { 
                    s[i] = 'a'; 
                } 
                  
                else
                { 
  
                    s[i] = (char) (s[i] + 1); 
 
                    if (isVowel(s[i]))  
                    { 
                        s[i] = (char) (s[i] + 1); 
                    } 
                } 
            } 
        } 
        return String.valueOf(s); 
    } 
}
