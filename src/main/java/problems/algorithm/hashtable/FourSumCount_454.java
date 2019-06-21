package problems.algorithm.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Search yaodong199@ciloud.com �ҵ��ַ�����������ĸ��λ��
 *
 */
public class FourSumCount_454 {

	// v1 ������C��D ������ϵĺʹ�����ұ��У� key�Ǻͣ�value �ǳ��ֵĴ�������¼A��B ������ϵĺ͵ĸ�ֵ��Ȼ���ڲ��ұ��в����Ƿ��ж�Ӧ��ֵ
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
