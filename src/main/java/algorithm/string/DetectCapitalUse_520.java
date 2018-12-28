package algorithm.string;

/**
 * 
 * @author search yaodong199@icloud.com 检测大写字母
 */
public class DetectCapitalUse_520 {

	// 判断是否为大写字母
	// A-Z:65-90 a-z:97-122
	// 利用正则表达式？
	public boolean detectCapitalUse(String word) {
		boolean lower = Character.isLowerCase(word.charAt(0));
		if (!lower && word.length() > 1)
			lower = Character.isLowerCase(word.charAt(1));
		for (int i = word.length() - 1; i >= 1; --i)
			if (Character.isLowerCase(word.charAt(i)) != lower)
				return false;
		return true;
	}

}
