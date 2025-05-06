package JavaPractie;

public class Reverselastword {

	    public static void main(String args[]) 
	    {
	        String input = "Hello Java World";
	        String[] words = input.split(" "); // Split the string into words
	        String lastWord = words[words.length - 1]; // Get the last word
	        
	        // Reverse the last word manually
	        char[] chars = lastWord.toCharArray();
	        String reversedLastWord = "";
	        for (int i = chars.length - 1; i >= 0; i--) {
	            reversedLastWord += chars[i]; // Append characters in reverse order
	        }
	        
	        words[words.length - 1] = reversedLastWord; // Replace the last word with reversed version
	        String result = String.join(" ", words); // Join words back into a string
	        
	        System.out.println("Original: " + input);
	        System.out.println("Modified: " + result);
	    }
	
}
