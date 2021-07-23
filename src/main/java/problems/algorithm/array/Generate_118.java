package problems.algorithm.array;

import java.util.ArrayList;
import java.util.List;

/** 
* @author search 
* @version 创建时间：2018年5月6日 下午4:33:42 
* 类说明  杨辉三角 I
*/
public class Generate_118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();

		if (numRows == 0) {
			return triangle;
		}

		triangle.add(new ArrayList<>());
		triangle.get(0).add(1);

		for (int rowNum = 1; rowNum < numRows; rowNum++) {
			List<Integer> row = new ArrayList<>();
			List<Integer> prevRow = triangle.get(rowNum - 1);

			row.add(1);
			for (int j = 1; j < rowNum; j++) {
				row.add(prevRow.get(j - 1) + prevRow.get(j));
			}
			row.add(1);
			triangle.add(row);
		}
		return triangle;
	}
}
