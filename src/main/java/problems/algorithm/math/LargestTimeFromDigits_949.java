package problems.algorithm.math;

import java.util.LinkedList;

/**
 * @author Search
 * @date 2019/1/18
 * 给定数字能组成的最大时间 949
 */
public class LargestTimeFromDigits_949 {

    /**
     * 排列组合 寻找前两位小于24 后两位小于60的最大值
     * 所有的组合数4×3×2×1=24种
     * @param a
     * @return
     */
    public String largestTimeFromDigits(int[] a) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("");
        for (int n : a) {
            for (int size = linkedList.size(); size > 0; size--) {
                String s = linkedList.poll();
                for (int i = 0; i <= s.length(); i++) {
                    linkedList.add(s.substring(0, i) + n + s.substring(i));
                }
            }
        }
        String res = "";
        for (String s : linkedList) {
            s = s.substring(0, 2) + ":" + s.substring(2);
            if (s.charAt(3) < '6' && s.compareTo("24:00") < 0 && s.compareTo(res) > 0) {
                res = s;
            }
        }
        return res;
    }

    public String largestTimeFromDigits2(int[] A) {
        for (int h = 23; h >= 0; h--) {
            for (int m = 59; m >= 0; m--) {

                boolean flag = true;
                int[] count = new int[10];

                count[h < 10 ? 0 : h / 10]++;
                count[h < 10 ? h : h % 10]++;
                count[m < 10 ? 0 : m / 10]++;
                count[m < 10 ? m : m % 10]++;

                for (int e : A) {
                    if (--count[e] < 0) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    return String.format("%02d:%02d", h, m);
                }
            }
        }

        return "";
    }

}
