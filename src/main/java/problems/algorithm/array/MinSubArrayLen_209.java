package problems.algorithm.array;

/**
 * 
 * @author Search yaodong199@icloud.com 209. ������С��������
 *
 */
public class MinSubArrayLen_209 {

	// v1 �����ƽ�
	public int minSubArrayLen(int s, int[] nums) {

		if (s <= 0 || nums == null)
			throw new IllegalArgumentException("Illigal Arguments");

		int res = nums.length + 1;
		for (int l = 0; l < nums.length; l++)
			for (int r = l; r < nums.length; r++) {
				int sum = 0;
				for (int i = l; i <= r; i++)
					sum += nums[i];
				if (sum >= s)
					res = Math.min(res, r - l + 1);
			}

		if (res == nums.length + 1)
			return 0;

		return res;
	}

	// v2 �Ż������ƽ�
	public int minSubArrayLenV2(int s, int[] nums) {

		if (s <= 0 || nums == null)
			throw new IllegalArgumentException("Illigal Arguments");

		// sums[i]���nums[0...i-1]�ĺ�
		int[] sums = new int[nums.length + 1];
		sums[0] = 0;
		for (int i = 1; i <= nums.length; i++)
			sums[i] = sums[i - 1] + nums[i - 1];

		int res = nums.length + 1;
		for (int l = 0; l < nums.length; l++)
			for (int r = l; r < nums.length; r++) {
				// ʹ��sums[r+1] - sums[l] ���ٻ��nums[l...r]�ĺ�
				if (sums[r + 1] - sums[l] >= s)
					res = Math.min(res, r - l + 1);
			}

		if (res == nums.length + 1)
			return 0;

		return res;
	}

	// v3��������
	public int minSubArrayLenV3(int s, int[] nums) {

		if (s <= 0 || nums == null)
			throw new IllegalArgumentException("Illigal Arguments");

		int l = 0, r = -1; // nums[l...r]Ϊ���ǵĻ�������
		int sum = 0;
		int res = nums.length + 1;

		while (l < nums.length) { // ���ڵ���߽������鷶Χ��,��ѭ������

			if (r + 1 < nums.length && sum < s)
				sum += nums[++r];
			else // r�Ѿ���ͷ ���� sum >= s
				sum -= nums[l++];

			if (sum >= s)
				res = Math.min(res, r - l + 1);
		}

		if (res == nums.length + 1)
			return 0;
		return res;
	}

	// v4 �������ڵ���һ��ʵ��
	public int minSubArrayLenV4(int s, int[] nums) {

		if (s <= 0 || nums == null)
			throw new IllegalArgumentException("Illigal Arguments");

		int l = 0, r = -1; // [l...r]Ϊ���ǵĴ���
		int sum = 0;
		int res = nums.length + 1;

		while (r + 1 < nums.length) { // ���ڵ��ұ߽��޷�������չ��, ��ѭ������

			while (r + 1 < nums.length && sum < s)
				sum += nums[++r];

			if (sum >= s)
				res = Math.min(res, r - l + 1);

			while (l < nums.length && sum >= s) {
				sum -= nums[l++];
				if (sum >= s)
					res = Math.min(res, r - l + 1);
			}
		}

		if (res == nums.length + 1)
			return 0;
		return res;
	}

	// v5 ��������
	public int minSubArrayLenV5(int s, int[] nums) {

		if (s <= 0 || nums == null)
			throw new IllegalArgumentException("Illigal Arguments");

		// sums[i]���nums[0...i-1]�ĺ�
		int[] sums = new int[nums.length + 1];
		sums[0] = 0;
		for (int i = 1; i <= nums.length; i++)
			sums[i] = sums[i - 1] + nums[i - 1];

		int res = nums.length + 1;
		for (int l = 0; l < nums.length - 1; l++) {
			// Java�����û�����õ�lowerBound������
			// ������Ҫ�Լ�ʵ��һ�����ڶ���������lowerBound:)
			int r = lowerBound(sums, sums[l] + s);
			if (r != sums.length) {
				res = Math.min(res, r - l);
			}
		}

		if (res == nums.length + 1)
			return 0;
		return res;
	}

	// ����������nums��Ѱ�Ҵ��ڵ���target����Сֵ
	// ���û�У�nums����������ֵ��С��target�����򷵻�nums.length
	private int lowerBound(int[] nums, int target) {

		if (nums == null /* || !isSorted(nums) */)
			throw new IllegalArgumentException("Illegal argument nums in lowerBound.");

		int l = 0, r = nums.length; // ��nums[l...r)�ķ�Χ��Ѱ�ҽ�
		while (l != r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] >= target)
				r = mid;
			else
				l = mid + 1;
		}

		return l;
	}

	private boolean isSorted(int[] nums) {
		for (int i = 1; i < nums.length; i++)
			if (nums[i] < nums[i - 1])
				return false;
		return true;
	}

}
