package algorithm.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 819. ����ĵ���
 * 
 * @author search yaodong199@icloud.com
 */
public class MostCommonWord_819 {
	// ����Ƶ����ߵĴ��Ҳ��ڽ�ֹ�б���

//	public String mostCommonWord(String paragraph, String[] banned) {
//		paragraph += ".";
//		// �����б�
//		Set<String> banset = new HashSet<>();
//		for (String sb : banned) {
//			banset.add(sb);
//		}
//		// Map<String, Integer> count String ->���� Integer->Ƶ��
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
