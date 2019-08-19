package problems.algorithm.string;

/**
 * @author search
 * @version 创建时间：2018年4月23日 下午4:57:46 类说明 :字符串中的单词数
 */
public class CountSegments_434 {
	public int countSegments(String s) {
		String trimmed = s.trim();
		if ("".equals(trimmed)) {
			return 0;
		}
		return trimmed.split("\\s+").length;
	}
}
