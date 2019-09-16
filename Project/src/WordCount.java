import java.util.Scanner; 
public class WordCount
{ 
	public static void main(String args[])
	{ 
		
		// Declare the object and initialize with 
        // predefined standard input object 
        Scanner sc = new Scanner(System.in); 
  
        // String input 
        String s = sc.nextLine(); 
		
        //word count variable to count number of words in a string 
		int count = 1;
        
		for (int i = 0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
 		System.out.println("Number of words in a string = " + count);
	}
}