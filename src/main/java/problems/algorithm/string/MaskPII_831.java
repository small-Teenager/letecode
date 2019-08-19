package problems.algorithm.string;
/**
 * 831. 隐藏个人信息
 * @author search
 * yaodong199@icloud.com
 */
public class MaskPII_831 {

	/**
	 * 如果S是邮箱，所有字符小写，按规则转换
	 * 如果是电话，
	 * @param S
	 * @return
	 */
	public String maskPII(String S) {
        int index = S.indexOf('@');
        if (index >= 0) { // email
        	StringBuffer sb=new StringBuffer(S.substring(0, 1));
        	sb.append("*****");
        	sb.append(S.substring(index - 1));
            return sb.toString().toLowerCase();
        } else { // phone
            String digits = S.replaceAll("\\D+", "");
            String local = "***-***-" + digits.substring(digits.length() - 4);
            if (digits.length() == 10) return local;
            String ans = "+";
            for (int i = 0; i < digits.length() - 10; ++i)
                ans += "*";
            return ans + "-" + local;
        }
    }
}
