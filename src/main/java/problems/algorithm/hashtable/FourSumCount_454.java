package problems.algorithm.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Search yaodong199@ciloud.com 找到字符串中所有字母异位词
 *
 */
public class FourSumCount_454 {

	// v1 将数组C，D 任意组合的和存入查找表中， key是和，value 是出现的次数。记录A，B 任意组合的和的负值，然后在查找表中查找是否有对应的值
	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < D.length; j++) {
				int sum = C[i] + D[j];
				if (map.containsKey(sum)) {
					map.put(sum, map.get(sum) + 1);
				} else {
					map.put(sum, 1);
				}
			}
		}

		int count = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {

				int res = -(A[i] + B[j]);
				if (map.containsKey(res)) {
					count += map.get(res);
				}

			}
		}

		return count;
	}

	// v2 hash
	public int fourSumCountV2(int[] A, int[] B, int[] C, int[] D) {
		int count = 0;
		Map<Integer, Integer> hashMap = new HashMap<>();
		for (int numA : A) {
			for (int numB : B) {
				int sumAB = numA + numB;
				hashMap.put(sumAB, hashMap.getOrDefault(sumAB, 0) + 1);
			}
		}
		for (int numC : C) {
			for (int numD : D) {
				int sumCD = numC + numD;
				count += hashMap.getOrDefault(-sumCD, 0);
			}
		}
		return count;
	}
}
