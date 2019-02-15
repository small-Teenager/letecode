package problems.algorithm.array;

/**
 * 
 * @author search 
 *  566. 重塑矩阵
 */
public class MatrixReshape_566 {

	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int[][] result = new int[r][c];
		// nums.length * nums[0].length为二维数组的行*列
		if (nums.length == 0 || r * c != nums.length * nums[0].length)
			return nums;
		int count = 0;
		// 把原始数组里的值赋值给新数组
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				result[count / c][count % c] = nums[i][j];
				count++;
			}
		}
		return result;
	}
}
