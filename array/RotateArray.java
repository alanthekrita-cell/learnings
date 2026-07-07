package array.com;

//import java.lang.reflect.Array;

public class RotateArray {

	public void rotateArray(int[] nums, int k) {
      
		int[] newNum = new int[nums.length];
		for (int i=0, j=0;i<nums.length;i++) {
			if (k>0) {
			newNum[i]=nums[nums.length-k];
			k--;
			} else {
				newNum[i]=nums[j];
				j++;
			}
		}
		
		for (int i=0;i<newNum.length;i++) {
			System.out.print(newNum[i]+", ");
		}
		System.out.println("");
            }
        
    

    public static void main(String[] args) {
        RotateArray ra = new RotateArray();
        int[] nums = {0, 1, 0, 3, 12, 0, 9};
        
        ra.rotateArray(nums, 3);
    }
}
