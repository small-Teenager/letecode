package problems.algorithm.stack;

import java.util.PriorityQueue;

/**
 * 
 * @author Search
 * @date 2019/6/17 215. 数组中的第K个最大元素
 */
public class FindKthLargest_215 {

	/**
	 * 快排 v1
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	public int findKthLargest(int[] nums, int k) {
		int l = 0;
		int r = nums.length - 1;
		int n = nums.length;
		while (true) {
			int pos = partition(nums, l, r);
			if (pos == n - k) {
				return nums[pos];
			} else if (pos > n - k) {
				r = pos - 1;
			} else {
				l = pos + 1;
			}
		}
	}

	private int partition(int[] nums, int l, int r) {
		int pivot = nums[l];
		int i = l + 1;
		int j = r;
		while (i <= j) {
			while (i <= r && nums[i] <= pivot) {
				i++;
			}
			while (j >= l + 1 && nums[j] >= pivot) {
				j--;
			}
			if (i > j) {
				break;
			}
			swap(nums, i, j);
			i++;
			j--;
		}
		swap(nums, l, j);
		return j;
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	// 堆排序v2
	public int findKthLargestV2(int[] nums, int k) {
		// 保存最大的k个数
		PriorityQueue<Integer> heap = new PriorityQueue<>(k);
		for (int i = 0; i < nums.length; i++) {
			if (heap.size() != k) {
				heap.add(nums[i]);
			} else if (nums[i] > heap.peek()) {
				heap.poll();
				heap.add(nums[i]);
			}
		}
		return heap.peek();
	}
}
