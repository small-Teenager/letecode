package problems.algorithm.math;

/**
 * @author Search
 * @data 9:13 2019/2/22
 * 全局倒置与局部倒置 775
 */
public class IsIdealPermutation_775 {

    /**
     * 当一个数字与其对应的角标偏移超过1时就会出现局部倒置与全局倒置不同
     * @param A
     * @return
     */
    public boolean isIdealPermutation(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] - i > 1 || A[i] - i < -1)
            {  return false;}
        }
        return true;
    }
}
