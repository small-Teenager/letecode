package problems.algorithm.math;

/**
 * @author Search
 * @data 11:12 2019/3/19
 * �Ȳ����л���
 */
public class NumberOfArithmeticSlices_413 {

    /**
     * ��̬�滮
     * @param A
     * @return
     */
    public int numberOfArithmeticSlices(int[] A) {
        int res=0;
        //����2���Ͳ���Ҫ�ж���
        for (int i=0;i<A.length-2;i++){
            //���һ�����������
            int c=A[i+1]-A[i];
            for (int j=i+2;j<A.length;j++){
                //��������Ⱦͼ�1;
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
