package CrackYourPlacement;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {
	public static void main(String[] args) {
		int[][] matrix = {
			{1, 1, 1},
			{1, 0, 1},
			{1, 1, 1}
		};

		setZeroes(matrix);
	}

	public static void setZeroes(int[][] matrix) {
		Set<Integer> rows = new HashSet<>();
		Set<Integer> cols = new HashSet<>();

		int n = matrix.length;
		int m = matrix[0].length;

		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == 0) {
					rows.add(i);
					cols.add(j);
				}
			}
		}

		for(int row : rows) {
			for(int i = 0; i < m; i++) {
				matrix[row][i] = 0;
			}
		}

		for(int col : cols) {
			for(int i = 0; i < n; i++) {
				matrix[i][col] = 0;
			}
		}
	}
}
