package array.com;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {

	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		int[] nums = {2,7,11,15};
		ts.checkSum(nums, 9);

	}

	public int[] checkSum(int[] nums, int k) {

		HashMap<Integer, Integer> hm = new HashMap();
		int index = 1;
		for (int num : nums) {
			hm.put(index, num);
			index++;
		}

		for (int i = 1; i <= nums.length; i++) {
			if (hm.containsValue(nums[i] - k)) {
				int[] ans = { i, hm..get(hm.containsValue(nums[i] - k)) };
				return ans;
			}
		}

		return null;

	}

}
