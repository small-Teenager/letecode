package problems.algorithm.array;

/**
 * 746. 使用最小花费爬楼梯
 * 
 * @author search yaodong199@icloud.com
 */
public class MinCostClimbingStairs_746 {

	/***
	 * cost.length:2--1000
	 * 
	 * @param cost
	 * @return
	 */
	public static int minCostClimbingStairs(int[] cost) {
		int f1 = 0, f2 = 0;
		for (int i = cost.length - 1; i >= 0; --i) {
			int f0 = cost[i] + Math.min(f1, f2);
			f2 = f1;
			f1 = f0;
		}
		return Math.min(f1, f2);
	}
}
