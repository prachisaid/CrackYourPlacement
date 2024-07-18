package CrackYourPlacement;

public class FindDuplicateNumber {
	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 2, 2};
		System.out.println(findDuplicate(arr));
	}

	public static int findDuplicate(int[] nums) {
		int i = 0;

		while(i < nums.length) {
			int correct = nums[i] - 1;

			if(nums[i] != nums[correct]) swap(nums, i, correct);
			else i++;
		}

		for(int j = 0; j < nums.length; j++) {
			int correct = nums[j] - 1;

			if(j != correct) return nums[j];
		}

		return -1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
