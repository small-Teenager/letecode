package algorithm.string;

/**
 * @author search
 * @version ����ʱ�䣺2018��4��23�� ����4:57:46 ��˵�� :�ַ����еĵ�����
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
