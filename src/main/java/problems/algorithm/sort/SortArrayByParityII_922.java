package problems.algorithm.sort;
/**
 * @author Search
 * @data 14:51 2019/2/13
 * 按奇偶排序数组II 922
 */
public class SortArrayByParityII_922 {

    /**
     * i 为奇 A[i]为奇 i为偶 A[i]为偶;
     * odd number  m%n==1
     * even number m%n==0
     * @param A
     * @return
     */
    public int[] sortArrayByParityII(int[] A) {
        int i=0,j = 1;
        for (; i < A.length - 1; i = i + 2) {
            if ((A[i] & 1) != 0) {
                while ((A[j] & 1) != 0) {
                    j = j + 2;
                }
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }
        return A;
    }
    public  static void main(String args[]){
        System.out.println(8%2);
    }
}
