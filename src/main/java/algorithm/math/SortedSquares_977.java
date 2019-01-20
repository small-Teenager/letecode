package algorithm.math;

import java.util.Arrays;
/**
 * @author Search
 * @date 2019/1/20
 * 有序数组的平方 977
 */
public class SortedSquares_977 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { -7, -3, 2, 3, 11 };

		System.out.println(sortedSquares(a));
	}
	
	public static int[] sortedSquares(int[] A) {

		for (int i = 0; i < A.length; i++) {
			A[i] *= A[i];
		}
		Arrays.sort(A);
		return A;
	}

}
