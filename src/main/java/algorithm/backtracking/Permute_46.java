package algorithm.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. È«ÅÅÁĞ
 * 
 * @author search yaodong199@icloud.com
 */
public class Permute_46 {

	
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> entry = new ArrayList<>();
		boolean[] used = new boolean[nums.length];

		loop(nums, res, entry, used);

		return res;
	}

	public void loop(int[] nums, List<List<Integer>> res, List<Integer> entry, boolean[] used) {
		if (entry.size() == nums.length) {
			res.add(new ArrayList<Integer>(entry));
			entry = new ArrayList<>();
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (!used[i]) {
				used[i] = true;
				entry.add(nums[i]);
				loop(nums, res, entry, used);
				used[i] = false;
				entry.remove(entry.size() - 1);
			}
		}
	}
	public static void main(String args[]){
		Permute_46 p=new Permute_46();
		int[] nums={1,2,3};
		System.out.println(p.permute(nums));
	}
	
}
