package algorithm.math;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Search
 * @data 9:13 2019/1/22
 * 强整数 970
 */
public class PowerfulIntegers_970 {

    /**
     * 暴力破解
     * 该方法会超时  40 40 1000
     * method1
     *
     * @param x
     * @param y
     * @param bound
     * @return
     */
    public List<Integer> powerfulIntegers(int x, int y, int bound) {

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < bound; i++) {
            for (int j = 0; j < bound; j++) {
                int temp = (int) (Math.pow(x, i) + Math.pow(y, j));
                if (temp <= bound) {
                    if (res.contains(temp)) {
                        continue;
                    }
                    res.add(temp);
                }
            }
        }
        return res;
    }

    /**
     * 对method1 的优化
     *
     * @param x
     * @param y
     * @param bound
     * @return
     */
    public List<Integer> powerfulIntegers2(int x, int y, int bound) {
        List<Integer> res = new ArrayList<>();

        for (int i = 1; i < bound; i *= x) {
            for (int j = 1; i + j <= bound; j *= y) {
                if (res.contains(i + j)) {
                    continue;
                }
                res.add(i + j);
                if (y == 1) {
                    break;
                }
            }
            if (x == 1) {
                break;
            }
        }
        return res;
    }

}
