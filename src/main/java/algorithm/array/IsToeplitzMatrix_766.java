package algorithm.array;

import java.util.HashMap;
import java.util.Map;

/** 
* @author search 
* @version 创建时间：2018年5月6日 下午3:34:26 
* 类说明   托普利茨矩阵
*/
public class IsToeplitzMatrix_766 {
	public boolean isToeplitzMatrix(int[][] matrix) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j= 0; j < matrix[0].length; j++) {
                if (!map.containsKey(i-j))
                	map.put(i-j, matrix[i][j]);
                else if (map.get(i-j) != matrix[i][j])
                    return false;
            }
        }
        return true;
    }
}
