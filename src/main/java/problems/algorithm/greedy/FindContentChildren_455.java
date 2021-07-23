package problems.algorithm.greedy;

import java.util.Arrays;

/**
 * 455. 分发饼干
 * 
 * @author search
 *
 */
public class FindContentChildren_455 {

	public static int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int count = 0;
		for (int i = 0; count < g.length && i < s.length; i++)
			count += g[count] <= s[i] ? 1 : 0;
		return count;
	}

	public static void main(String[] args) {

		int g1[] = { 1, 2, 3 };
		int s1[] = { 1, 1 };
		System.out.println((new FindContentChildren_455()).findContentChildren(g1, s1));

		int g2[] = { 1, 2 };
		int s2[] = { 1, 2, 3 };
		System.out.println((new FindContentChildren_455()).findContentChildren(g2, s2));
	}
}
