package problems.algorithm.math;
/**
 * 633. ƽ����֮��
 * @author search
 * yaodong199@icloud.com
 */
public class JudgeSquareSum_633 {
	/**
	 * �����ƽ� ����ʱ������
	 * @param c
	 * @return
	 */
	  public boolean judgeSquareSum(int c) {
	        for (long a = 0; a * a <= c; a++) {
	            for (long b = 0; b * b <= c; b++) {
	                if (a * a + b * b == c)
	                    return true;
	            }
	        }
	        return false;
	    }
	  
	  public boolean judgeSquareSum2(int c) {
	        for (long a = 0; a * a <= c; a++) {
	            double b = Math.sqrt(c - a * a);
	            if (b == (int) b)
	                return true;
	        }
	        return false;
	    }
}
