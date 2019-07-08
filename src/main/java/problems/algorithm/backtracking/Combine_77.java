package problems.algorithm.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ���
 * 
 * @author search
 *
 */
public class Combine_77 {

	private ArrayList<List<Integer>> res;

	public List<List<Integer>> combine(int n, int k) {

		res = new ArrayList<List<Integer>>();
		if (n <= 0 || k <= 0 || k > n)
			return res;

		LinkedList<Integer> c = new LinkedList<Integer>();
		generateCombinations(n, k, 1, c);

		return res;
	}

	// ���C(n,k), ��ǰ�Ѿ��ҵ�����ϴ洢��c��, ��Ҫ��start��ʼ�����µ�Ԫ��
	private void generateCombinations(int n, int k, int start, LinkedList<Integer> c) {

		if (c.size() == k) {
			res.add((List<Integer>) c.clone());
			return;
		}

		for (int i = start; i <= n; i++) {
			c.addLast(i);
			generateCombinations(n, k, i + 1, c);
			c.removeLast();
		}

		return;
	}

	private static void printList(List<Integer> list) {
		for (Integer e : list)
			System.out.print(e + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		List<List<Integer>> res = (new Combine_77()).combine(4, 2);
		for (List<Integer> list : res)
			printList(list);
	}

	//V2
	public List<List<Integer>> combineV2(int n, int k) {

		res = new ArrayList<List<Integer>>();
		if (n <= 0 || k <= 0 || k > n)
			return res;

		LinkedList<Integer> c = new LinkedList<Integer>();
		generateCombinations(n, k, 1, c);

		return res;
	}

	// ���C(n,k), ��ǰ�Ѿ��ҵ�����ϴ洢��c��, ��Ҫ��start��ʼ�����µ�Ԫ��
	private void generateCombinationsV2(int n, int k, int start, LinkedList<Integer> c) {

		if (c.size() == k) {
			res.add((List<Integer>) c.clone());
			return;
		}

		// ����k - c.size()����λ, ����, [i...n] ������Ҫ�� k - c.size() ��Ԫ��
		// i���Ϊ n - (k - c.size()) + 1
		for (int i = start; i <= n - (k - c.size()) + 1; i++) {
			c.addLast(i);
			generateCombinations(n, k, i + 1, c);
			c.removeLast();
		}

		return;
	}
}
