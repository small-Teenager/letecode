package algorithm.math;

/**
 * @date 2019/1/10
 * @author Search
 * �����ص� 836
 */
public class IsRectangleOverlap_836 {

    /**
     * �ж�2�������Ƿ��ص�
     * @param rec1
     * @param rec2
     * @return
     */
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return (Math.min(rec1[2], rec2[2]) > Math.max(rec1[0], rec2[0]) && // width > 0
                Math.min(rec1[3], rec2[3]) > Math.max(rec1[1], rec2[1]));  // height > 0
    }
}
