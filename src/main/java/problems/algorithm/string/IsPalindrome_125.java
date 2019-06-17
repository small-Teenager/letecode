package problems.algorithm.string;
/** 
* @author search 
* @version 创建时间：2018年4月23日 下午4:50:19 
* 类说明 :125. 验证回文串
*/
public class IsPalindrome_125 {
	/**
	 * 1.get letter number 
	 * 2.change to lower case 
	 * 3.verification the code
	 * @param s
	 * @return
	 */
	public boolean isPalindrome(String s) {
		s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		StringBuilder sb = new StringBuilder(s);
		return s.equals(sb.reverse().toString());

	}
	
	public boolean isPalindrome2(String s) {
		if (s.equals(""))
			return true;
		s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	
	//用两个指针，分别指向字符串头和字符串尾，一个向前走，一个向后面走
	 public boolean isPalindromeV3(String s) {
	        if (s == null) return false;
	        if (s.length() == 0) return true;
	        int i = 0;
	        int j = s.length() - 1;
	        while (i < j) {
	            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
	            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
	            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
	            i++;
	            j--;
	        }
	        return true;
	    }

}
