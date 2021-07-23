package problems.algorithm.array;

/**
 * @author Search
 * @data 13:02 2019/1/21
 * 最长湍流子数组
 */
public class MaxTurbulenceSize_978 {

    public int maxTurbulenceSize(int[] A) {
        if (A.length == 1) {
            return A.length;
        }

        int flag = 0;
        int tmp = 1;
        int res = 1;
        for (int i = 0; i < A.length - 1; i++) {
            switch (flag) {
                case 0:
                    if (A[i] < A[i + 1]) {
                        flag = -1;
                        tmp = 2;
                    } else if (A[i] > A[i + 1]) {
                        flag = 1;
                        tmp = 2;
                    } else {
                        tmp = 1;
                    }
                    break;
                case -1:
                    if (A[i] > A[i + 1]) {
                        tmp++;
                        flag = 1;
                    } else if (A[i] == A[i + 1]) {
                        flag = 0;
                        tmp = 1;
                    } else {
                        flag = -1;
                        tmp = 2;
                    }
                    break;
                case 1:
                    if (A[i] < A[i + 1]) {
                        tmp++;
                        flag = -1;
                    } else if (A[i] == A[i + 1]) {
                        flag = 0;
                        tmp = 1;
                    } else {
                        flag = 1;
                        tmp = 2;
                    }
                    break;
            }
            res = Math.max(res, tmp);
        }
        return res;
    }
}
