package problems.algorithm.string;
/**
 * 赎金信 383
 * @author search
 * yaodong199@icloud.com
 */
public class CanConstruct_383 {

	//magazine 是 ransomNote的压缩字符
	public boolean canConstruct(String ransomNote, String magazine) {
        if ("".equals(ransomNote)) {
            return true;
        }
        if ("".equals(magazine)) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            counter[ch - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (counter[ch - 'a'] == 0) {
                return false;
            } else {
                counter[ch - 'a']--;
            }
        }
        return true;
    }
}
