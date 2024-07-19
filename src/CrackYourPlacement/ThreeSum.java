package CrackYourPlacement;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) {
		int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
		System.out.println(findDuplicates(nums));
	}

	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> ans = new ArrayList<>();

		int i = 0;

		while(i < nums.length) {
			int correct = nums[i] - 1;

			if(nums[i] != nums[correct]) swap(nums, i, correct);
			else i++;
		}

		for(int j = 0; j < nums.length; j++) {
			int correct = nums[j] - 1;

			if(j != correct) ans.add(nums[j]);
		}

		return ans;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
