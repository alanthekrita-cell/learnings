package string;

public class ReverseWords {
	
	public String reverseWords(String s) {
    
		String[] words = s.trim().split("\\s+");
		StringBuilder reveresedString = new StringBuilder();
		
		for(int i=words.length-1; i>=0; i--) {
			reveresedString.append(words[i]);
			if(i!=0) {
				reveresedString.append(" ");
			}
		}
		return reveresedString.toString();
		
    }

public static void main(String arg[]) {
	ReverseWords rw = new ReverseWords();
	String k=rw.reverseWords("This    is");
	System.out.println(k);
}

}
