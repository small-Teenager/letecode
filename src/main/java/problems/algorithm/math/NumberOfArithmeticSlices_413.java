package problems.algorithm.math;

/**
 * @author Search
 * @data 11:12 2019/3/19
 * 等差数列划分
 */
public class NumberOfArithmeticSlices_413 {

    /**
     * 动态规划
     * @param A
     * @return
     */
    public int numberOfArithmeticSlices(int[] A) {
        int res=0;
        //后面2个就不需要判断了
        for (int i=0;i<A.length-2;i++){
            //与后一个数的相差数
            int c=A[i+1]-A[i];
            for (int j=i+2;j<A.length;j++){
                //如果相差相等就加1;
                if (A[j]-A[j-1]==c){
                    res++;
                }else{
                    break;
                }
            }
        }
        return res;
    }
}
