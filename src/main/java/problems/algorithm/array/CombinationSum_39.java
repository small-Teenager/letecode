package problems.algorithm.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合总和
 * 
 * @author search yaodong199@icloud.com
 */
public class CombinationSum_39 {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		// Arrays.sort(candidates);
		backtrack(ans, new ArrayList<>(), candidates, target);
		return ans;
	}

	private void backtrack(List<List<Integer>> ans, List<Integer> tmp, int[] candidates, int target) {
		if (target == 0) {
			ans.add(new ArrayList<>(tmp));
		} else {
			for (int i = 0; i < candidates.length; i++) {
				if (candidates[i] > target || !tmp.isEmpty() && candidates[i] < tmp.get(tmp.size() - 1)) {
					continue;
				}
				tmp.add(candidates[i]);
				backtrack(ans, tmp, candidates, target - candidates[i]);
				tmp.remove(tmp.size() - 1);
			}
		}
	}
}
