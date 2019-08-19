package problems.algorithm.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角 II
 * 
 * @author search yaodong199@icloud.com
 */
public class GetRow_119 {

	public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<Integer>();
		if (rowIndex < 0) {
			return list;
		}
		
		for (int i = 0; i < rowIndex + 1; i++) {
			list.add(0, 1);//添加元素 1
			for (int j = 1; j < list.size() - 1; j++) {
				list.set(j, list.get(j) + list.get(j + 1));
			}
		}
		return list;
	}
}
