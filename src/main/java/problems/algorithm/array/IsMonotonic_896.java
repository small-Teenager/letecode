package problems.algorithm.array;

/**
 * 896. 单调数列
 * 
 * @author search yaodong199@icloud.com
 */
public class IsMonotonic_896 {
	/**
	 * 单调增或单调减
	 * @param A
	 * @return
	 */
	public boolean isMonotonic(int[] A) {
		return increasing(A) || decreasing(A);
	}

	public boolean increasing(int[] A) {
		for (int i = 0; i < A.length - 1; ++i)
			if (A[i] > A[i + 1])
				return false;
		return true;
	}

	public boolean decreasing(int[] A) {
		for (int i = 0; i < A.length - 1; ++i)
			if (A[i] < A[i + 1])
				return false;
		return true;
	}
}
