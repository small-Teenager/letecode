package problems.algorithm.math;

/**
 * @author Search
 * @data 9:13 2019/2/22
 * ȫ�ֵ�����ֲ����� 775
 */
public class IsIdealPermutation_775 {

    /**
     * ��һ�����������Ӧ�ĽǱ�ƫ�Ƴ���1ʱ�ͻ���־ֲ�������ȫ�ֵ��ò�ͬ
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
