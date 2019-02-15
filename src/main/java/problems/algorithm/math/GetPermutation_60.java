package problems.algorithm.math;

import java.util.LinkedList;

/**
 * @author Search
 * @date 2019/1/15
 * 第k个排列 60
 */
public class GetPermutation_60 {

    /**
     * 列出集合的排列 取其中第k 个
     *
     * @param n
     * @param k
     * @return
     */
    public String getPermutation(int n, int k) {
        LinkedList<Integer> link = new LinkedList<Integer>();
        //排列数量
        int weight = 1;

        for (int i = 1; i <= n; i++) {
            link.add(i);
            if (i == n) {
                break;
            }
            weight *= i;
        }
        StringBuilder res = new StringBuilder("");
        k -= 1;
        while (true) {
            res.append(link.remove(k / weight));
            k %= weight;
            if (link.isEmpty()) {
                break;
            }
            weight = weight / link.size();
        }

        return res.toString();
    }

    public static void main(String args[]) {
        GetPermutation_60 s = new GetPermutation_60();
        System.out.println(s.getPermutation(3, 3));
    }
}
