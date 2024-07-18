package CrackYourPlacement;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args) {
		int[] arr = {2, 7, 11, 15};
		System.out.println(Arrays.toString(twoSum(arr, 9)));
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();


		for(int i = 0; i < nums.length; i++) {
			int sum = target - nums[i];
			if(map.containsKey(sum)) {
				return new int[] { map.get(sum), i};
			}
			else {
				map.put(nums[i], i);
			}
		}

		return new int[] {-1, -1};
	}
}
