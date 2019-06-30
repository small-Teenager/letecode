package problems.algorithm.math;
/**
 * @author Search
 * @data 16:41 2019/1/24
 * ��ȫƽ���� 279
 */
public class NumSquares_279 {
    /**
     * ��ƽ������ �κ�һ�������������Ա�ʾ�ɲ������ĸ�������ƽ��֮�͡� ���ۣ���������ƽ���Ͷ������n���ĸ���������������ض����� n=4^a(8b+7)
     *
     * @param n
     * @return
     */
    public int numSquares(int n) {
        //�ȸ��������ᵽ�Ĺ�ʽ����Сn
        while (n % 4 == 0) {
            n /= 4;
        }
        //������㹫ʽ �򷵻�4
        if (n % 8 == 7) {
            return 4;
        }
        //���ж���С������Ƿ������һ������ƽ������������ƽ���ĺ����
        int a = 0;
        while ((a * a) <= n) {
            int b = (int) Math.sqrt((n - a * a));
            if (a * a + b * b == n) {
                //������� �����ﷵ��
                if (a != 0 && b != 0) {
                    return 2;
                } else {
                    return 1;
                }
            }
            a++;
        }
        //������� ����3
        return 3;
    }
}
