
public class CheckSubstring {

	// Function that returns true if the word is found
	static boolean isWordPresent(String sentence, String word)
	{
	    // To break the sentence in words
	    String []s = sentence.split(" ");
	 
	    // To temporarily store each individual word
	    for ( String temp :s)
	    {
	 
	        // Comparing the current word
	        // with the word to be searched
	        if (temp.compareTo(word) == 0)
	        {
	            return true;
	        }
	    }
	    return false;
	}
	 
	// Driver code
	public static void main(String[] args)
	{
	    String s = "I am learning Java";
	    String word = "Java";
	 
	    if (isWordPresent(s, word))
	        System.out.print("Yes");
	    else
	        System.out.print("No");
	 
	}
}
