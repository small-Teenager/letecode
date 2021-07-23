package problems.algorithm.string;

/**
 * 345. 反转字符串中的元音字母
 * 
 * @author search yaodong199@icloud.com
 */
public class ReverseVowels_345 {

	public String reverseVowels(String s) {
		String res = "";
		int length = s.length();
		char[] vowels = new char[length];
		if (s == null || length == 0)
			return res;
		char[] letters = s.toCharArray();
		int b = 0;
		for (int k = 0; k < length; k++) {
			if (letters[k] == 'a' || letters[k] == 'e' || letters[k] == 'i' || letters[k] == 'o' || letters[k] == 'u'
					|| letters[k] == 'A' || letters[k] == 'E' || letters[k] == 'I' || letters[k] == 'O'
					|| letters[k] == 'U') {
				vowels[b++] = letters[k];
			}
		}
		int m = letters.length, n = 0;
		for (int i = m - 1; i >= 0; i--) {
			if (letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u'
					|| letters[i] == 'A' || letters[i] == 'E' || letters[i] == 'I' || letters[i] == 'O'
					|| letters[i] == 'U') {
				letters[i] = vowels[n++];
			}
		}
		return new String(letters);
	}
}
