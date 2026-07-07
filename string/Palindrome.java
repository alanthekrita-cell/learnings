package string;

//import array.com.MajorityElement;

public class Palindrome {
    public boolean isPali(String s) {
//        s.replaceAll("[^a-zA-Z]+","");
        for (int i=0;i< s.length()/2;i++) {
        	if (s.replaceAll("[^a-zA-Z]+","").toLowerCase().charAt(i) ==s.replaceAll("[^a-zA-Z]+","").toLowerCase().charAt(s.length()-1-i)) {
        		continue;
        	} else { return false;}
        }
        return true;
        
    }
    
  

    public static void main(String[] args) {
        Palindrome checkPali = new Palindrome();
        String s = "A man, a plan, a canal: Panama";
//        System.out.println("Majority element: " + me.majorityElement(nums));
        // Output: Majority element: 2
//        int[] toRemoveDuplicates = {0,0,0,1,1,1,2,2,3,3,3,4,4,5};
//        System.out.println( me.removeDuplicates(toRemoveDuplicates));
        System.out.println("String is Palindrome ? :" + checkPali.isPali(s.replaceAll("[^a-zA-Z]+","").toLowerCase()));
        
        
    }
}