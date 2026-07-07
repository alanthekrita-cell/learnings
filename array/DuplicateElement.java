package array.com;

import java.util.HashSet;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateElement de = new DuplicateElement();
		int nums[] = {1,2,3,4,5, 2};
		System.out.println(de.containsDuplicate(nums));

	}

	
public HashSet<Integer> containsDuplicate(int[] nums) {
	HashSet<Integer> seenNumber = new HashSet<>();
	HashSet<Integer> unseenNums = new HashSet<Integer>();
	
	for (int num : nums) {
		if (unseenNums.contains(num)) {
//			return true;
			seenNumber.add(num);
		} 
		else {
			unseenNums.add(num);
		}
		
	}
	System.out.println(seenNumber);
	System.out.println(unseenNums);
	return seenNumber;
        
    }
}
