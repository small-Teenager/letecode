package problems.algorithm.string;
/**
 * 
 * @author search yaodong199@icloud.com
 * ·´×ª×Ö·û´® II
 */
public class ReverseStr_541 {

	public String reverseStr(String s, int k) {
		char[] a = s.toCharArray();
		for (int start = 0; start < a.length; start += 2 * k) {
			int i = start, j = Math.min(start + k - 1, a.length - 1);
			while (i < j) {
				char tmp = a[i];
				a[i++] = a[j];
				a[j--] = tmp;
			}
		}
		return new String(a);
	}
}
