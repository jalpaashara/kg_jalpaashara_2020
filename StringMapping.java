import java.io.IOException;
import java.util.HashMap;

public class StringMapping {
	public static boolean oneToOneMapping(String s1, String s2) {
		HashMap<Character,Character> charMap = new HashMap<>();
        /*
         * I am assuming that when s1 and s2 are not of the same length there are characters without a mapping 
         * and hence returning false in that case.
         */
		if(s1.length()!=s2.length() || (s1.length()==0 && s2.length()==0)) {
			return false;
		}
		
        for (int i=0;i<s1.length();i++){
            if(charMap.containsKey(s1.charAt(i))){
                if(charMap.get(s1.charAt(i))!=s2.charAt(i)) {
                	return false;
                }
            }
            else{
                charMap.put(s1.charAt(i),s2.charAt(i));
            }
        }
        
		return true;
	}
	

    public static void main(String[] args) throws IOException {
    	if(args.length<2) {
        	System.out.println("Invalid input.");
        	System.out.println("Sample Input: \nIf String 1 is bar and String 2 is foo then the run command should be:" +
        			"\njava StringMapping bar foo");
        	return;
        }
        String s1 = args[0];
        
        String s2 = args[1];
        
        
        boolean result = oneToOneMapping(s1, s2);
        System.out.println(result);
        
    }
}
