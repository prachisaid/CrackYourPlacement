package CrackYourPlacement;

public class MovesZeroes {
	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 3, 12};
		moveZeroes(arr);
	}

	public static void moveZeroes(int[] arr) {
		int j = 0;

		while(j < arr.length && arr[j] !=  0) {
			j++;
		}

		int i = j + 1;
		while(i < arr.length && j < arr.length) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}

			i++;
		}
	}
}
