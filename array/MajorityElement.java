package array.com;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate =0;//= null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
    
    public int removeDuplicates(int[] nums) {
        int counter=0;
        for(int i=0;i<nums.length;i++){
            if(nums[counter]==nums[i]){
                continue;
            }
            counter++;
            nums[counter]=nums[i];
            

        }
        for (int j=0;j<counter;j++) {
        	System.out.println(nums[j]);
        }
        return counter++;
    }

    public static void main(String[] args) {
        MajorityElement me = new MajorityElement();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority element: " + me.majorityElement(nums));
        // Output: Majority element: 2
        int[] toRemoveDuplicates = {0,0,0,1,1,1,2,2,3,3,3,4,4,5};
        System.out.println( me.removeDuplicates(toRemoveDuplicates));
        
    }
}
