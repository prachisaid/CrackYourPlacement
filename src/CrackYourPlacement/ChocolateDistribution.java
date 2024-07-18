package CrackYourPlacement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChocolateDistribution {
	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<>();
		lst.add(3);
		lst.add(4);
		lst.add(1);
		lst.add(9);
		lst.add(56);
		lst.add(7);
		lst.add(9);
		lst.add(12);

		System.out.println(findMinDiff(lst, 8, 5));
	}

	public static long findMinDiff (ArrayList<Integer> a, int n, int M) {
		Collections.sort(a);

		int i = 0;
		int ans = Integer.MAX_VALUE;

		while((i + (M - 1)) < a.size()) {
			int mini = a.get(i);
			int mazi = a.get(i + (M - 1));

			ans = Math.min(ans, mazi - mini);
			i++;
		}

		return ans;
	}
}
