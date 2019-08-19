package problems.algorithm.math;
/**
 * @author Search
 * @data 16:41 2019/1/24
 * 完全平方数 279
 */
public class NumSquares_279 {
    /**
     * 四平方定理： 任何一个正整数都可以表示成不超过四个整数的平方之和。 推论：满足四数平方和定理的数n（四个整数的情况），必定满足 n=4^a(8b+7)
     *
     * @param n
     * @return
     */
    public int numSquares(int n) {
        //先根据上面提到的公式来缩小n
        while (n % 4 == 0) {
            n /= 4;
        }
        //如果满足公式 则返回4
        if (n % 8 == 7) {
            return 4;
        }
        //在判断缩小后的数是否可以由一个数的平方或者两个数平方的和组成
        int a = 0;
        while ((a * a) <= n) {
            int b = (int) Math.sqrt((n - a * a));
            if (a * a + b * b == n) {
                //如果可以 在这里返回
                if (a != 0 && b != 0) {
                    return 2;
                } else {
                    return 1;
                }
            }
            a++;
        }
        //如果不行 返回3
        return 3;
    }
}
