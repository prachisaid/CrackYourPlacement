package CrackYourPlacement;

public class MajorityElement {
	public static void main(String[] args) {
		int[] nums = {3, 2, 3};
		System.out.println(majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {
		int cnt = 0;
		int elem = -1;

		for(int i = 0; i < nums.length; i++) {
			if(cnt == 0){
				cnt = 1;
				elem = nums[i];
			}
			else if(nums[i] == elem) {
				cnt++;
			}
			else{
				cnt--;
			}
		}

		return elem;
	}
}
