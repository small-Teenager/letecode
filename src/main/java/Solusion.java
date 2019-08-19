import java.util.HashMap;
import java.util.Map;
/**
 * 找出数组中第2个重复出现的元素
 * @author search
 *
 */
public class Solusion {

	public Integer getFirstDoubleRetitiveItem(int[] items) {

		if (items.length < 2)
			return null;

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0, length = items.length; i < length; i++) {
			// map是否存在元素，已存在返回改元素，没有则添加
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
