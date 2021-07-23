package problems.algorithm.array;

/**
 * 盛最多水的容器
 * 
 * @author search yaodong199@icloud.com
 */
public class MaxArea_11 {

	/**
	 * 暴力破解
	 * 
	 * @param height
	 * @return
	 */
	public int maxArea(int[] height) {
		int maxarea = 0;
		for (int i = 0; i < height.length; i++)
			for (int j = i + 1; j < height.length; j++)
				maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
		return maxarea;
	}

	/**
	 * 2 指针
	 * 
	 * @param height
	 * @return
	 */
	public int maxArea2(int[] height) {
		int maxarea = 0, l = 0, r = height.length - 1;
		while (l < r) {
			maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
			if (height[l] < height[r])
				l++;
			else
				r--;
		}
		return maxarea;
	}
}
