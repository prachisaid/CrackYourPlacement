package CrackYourPlacement;

public class MergeSortedArray {
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 0, 0, 0};
		int[] nums2 = {2, 5, 6};

		merge(nums1, 3, nums2, 3);
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int [] ans = new int[m + n];
		System.out.println(ans.length);
		int i = 0;
		int j = 0;
		int k = 0;

		while((i < m) && (j < n)){
			if(nums1[i] <= nums2[j]){
				ans[k] = nums1[i];
				k++; i++;
			}
			else if(nums1[i] > nums2[j]){
				ans[k] = nums2[j];
				k++; j++;
			}
		}

		while(i < m){
			ans[k] = nums1[i];
			i++; k++;
		}

		while(j < n){
			ans[k] = nums2[j];
			j++; k++;
		}

		for(int i1 = 0; i1 < ans.length; i1++){
			nums1[i1] = ans[i1];
		}
	}
}
