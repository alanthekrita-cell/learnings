package array.com;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zeroPos = 0; // Position to place the next non-zero element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[zeroPos];
                nums[zeroPos] = temp;
                zeroPos++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroes mz = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12, 0, 9};
        mz.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Output: 1 3 12 0 0
    }
}
