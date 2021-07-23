package problems.algorithm.array;

/**
 * @author search
 * @version 创建时间：2018年4月23日 下午4:10:32 类说明:加一
 */
public class PlusOne_66 {

	public static int[] plusOne(int[] digits) {
		if (digits == null || digits.length < 1)
			return new int[] { 1 };
//		if (digits[digits.length - 1] < 9) {
//			digits[digits.length - 1] = digits[digits.length - 1] + 1;
//			return digits;
//		}
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] != 9) {
				digits[i] += 1;
				break;
			} else {
				digits[i] = 0;
				if (digits[0] == 0) {
					int[] result = new int[digits.length + 1];
					result[0] = 1;
					return result;
				}
			}
		}
		return digits;
	}
}
