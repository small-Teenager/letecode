import java.util.HashMap;
import java.util.Map;
/**
 * �ҳ������е�2���ظ����ֵ�Ԫ��
 * @author search
 *
 */
public class Solusion {

	public Integer getFirstDoubleRetitiveItem(int[] items) {

		if (items.length < 2)
			return null;

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0, length = items.length; i < length; i++) {
			// map�Ƿ����Ԫ�أ��Ѵ��ڷ��ظ�Ԫ�أ�û�������
			if (map.containsKey(items[i])) {
				return items[i];
			} else {
				map.put(items[i], 1);
			}
		}
		return null;
	}

	public static void main(String args[]) {

		Solusion solusion = new Solusion();
//		int[] items= {1,2,3,4,5,2,3,4,2};
//		int[] items = {1,1};
		int[] items = {};

		System.out.println(solusion.getFirstDoubleRetitiveItem(items));
	}

}
