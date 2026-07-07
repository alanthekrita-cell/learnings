package array.com;

public class ProdExcepSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProdExcepSelf pe = new ProdExcepSelf();
		int[] nums = { 1, 2, 3,4 };
		pe.prodExceptSelf(nums);

	}

	public int[] prodExceptSelf(int[] nums) {
		int prod = 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				prod = prod * nums[i];
			}
		}

		int[] prodArray = new int[nums.length];
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != 0) {
				prodArray[j] = prod / nums[j];
			}
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println(prodArray[i]);
		}

		return prodArray;
	}

}
