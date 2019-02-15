package problems.algorithm.math;

/**
 * 507. 完美数
 * 
 * @author search yaodong199@icloud.com
 */
public class CheckPerfectNumber_507 {

	/**
	 * 暴力破解 超出时间限制
	 * @param num
	 * @return
	 */
	 public boolean checkPerfectNumber(int num) {
	        if (num <= 0) {
	            return false;
	        }
	        int sum = 0;
	        for (int i = 1; i < num; i++) {
	            if (num % i == 0) {
	                sum += i;
	            }
	        }
	        return sum == num;
	    }
	 
	 public boolean checkPerfectNumber2(int num) {
	        if (num <= 0) {
	            return false;
	        }
	        int sum = 0;
	        for (int i = 1; i * i <= num; i++) {
	            if (num % i == 0) {
	                sum += i;
	                if (i * i != num) {
	                    sum += num / i;
	                }

	            }
	        }
	        return sum - num == num;
	    }
}
