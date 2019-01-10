package algorithm.math;

/**
 * @author Search
 * 矩形面积 223
 * @date 2019/1/10
 */
public class ComputeArea_223 {
    /**
     * math
     * 二个大矩形的面积和-重叠的面积和
     * a U b -a*b
     * @param A
     * @param B
     * @param C
     * @param D
     * @param E
     * @param F
     * @param G
     * @param H
     * @return
     */
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int a = Math.abs(A - C) * Math.abs(B - D);

        int b = Math.abs(E - G) * Math.abs(F - H);

        return a + b - overlap(A, B, C, D, E, F, G, H);
    }

    public int computeArea2(int A, int B, int C, int D, int E, int F, int G, int H) {
        int a = (A - C) * (B - D);

        int b = (E - G) * (F - H);

        return a + b - overlap(A, B, C, D, E, F, G, H);
    }

    /**
     * a交b 其中考虑a b 不相交
     * @param A
     * @param B
     * @param C
     * @param D
     * @param E
     * @param F
     * @param G
     * @param H
     * @return
     */
    private int overlap(int A, int B, int C, int D, int E, int F, int G, int H) {
        int hTop = Math.min(D, H);
        int hBot = Math.max(B, F);
        int wTop = Math.min(C, G);
        int wBot = Math.max(A, E);
        if (hTop < hBot || wTop < wBot) {
            return 0;
        } else {
            return (hTop - hBot) * (wTop - wBot);
        }
    }
}
