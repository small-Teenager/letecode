package problems.algorithm.string;

/**
 * 819. 最常见的单词
 * 
 * @author search yaodong199@icloud.com
 */
public class MostCommonWord_819 {
	// 出现频率最高的词且不在禁止列表中

//	public String mostCommonWord(String paragraph, String[] banned) {
//		paragraph += ".";
//		// 禁用列表
//		Set<String> banset = new HashSet<>();
//		for (String sb : banned) {
//			banset.add(sb);
//		}
//		// Map<String, Integer> count String ->单词 Integer->频率
//		Map<String, Integer> count = new HashMap<>();
//
//		String ans = "";
//		int ansfreq = 0;
//
//		StringBuilder sb = new StringBuilder();
//		for (char c : paragraph.toCharArray()) {
//			if (Character.isLetter(c)) {
//				sb.append(Character.toLowerCase(c));
//			} else if (sb.length() > 0) {
//				String finalsb = sb.toString();
//				if (!banset.contains(finalsb)) {
//					count.put(finalsb, count.getOrDefault(finalsb, 0) + 1);
//					if (count.get(finalsb) > ansfreq) {
//						ans = finalsb;
//						ansfreq = count.get(finalsb);
//					}
//				}
//				sb = new StringBuilder();
//			}
//		}
//
//		return ans;
//	}
}
