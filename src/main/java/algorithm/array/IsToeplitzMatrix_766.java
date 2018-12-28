package algorithm.array;

import java.util.HashMap;
import java.util.Map;

/** 
* @author search 
* @version ����ʱ�䣺2018��5��6�� ����3:34:26 
* ��˵��   �������ľ���
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
