package algorithm.math;

/**
 * @author Search
 * @data 11:37 2019/2/15
 * 范围求和 II 598
 */
public class MaxCount_598 {

    /**
     * 每次操作都是左上角区域从（0, 0）到（a, b）的矩形，必定重叠，所以找最小的a乘最小的b就行
     * @param m
     * @param n
     * @param ops
     * @return
     */
    public int maxCount(int m, int n, int[][] ops) {
        int row=Integer.MAX_VALUE ,col=Integer.MAX_VALUE;

        if(ops.length<1) { return m*n;}
        for(int i=0;i<ops.length;i++) {
            row=Math.min(row, ops[i][0]);
            col=Math.min(col, ops[i][1]);
        }
        return row*col;
    }
}
