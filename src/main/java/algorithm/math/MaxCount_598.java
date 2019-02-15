package algorithm.math;

/**
 * @author Search
 * @data 11:37 2019/2/15
 * ��Χ��� II 598
 */
public class MaxCount_598 {

    /**
     * ÿ�β����������Ͻ�����ӣ�0, 0������a, b���ľ��Σ��ض��ص�����������С��a����С��b����
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
