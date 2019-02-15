package problems.algorithm.array;

/**
 * @author Search
 * @date 2019/1/17
 * 쳲��������� 509
 */
public class Fib_509 {

    /**
     * �ݹ�
     * method1
     *
     * @param N
     * @return
     */
    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return fib(N - 1) + fib(N - 2);
    }

    /**
     * ��method1 �ݹ���Ż�
     *
     * @param N
     * @return
     */
    public int fib2(int N) {
        if (N < 2) {
            return N;
        }
        int res = 0,
                secondLast = 0, last = 1;
        for (int i = 2; i <= N; i++) {
            res = secondLast + last;
            secondLast = last;
            last = res;
        }
        return res;
    }

}
