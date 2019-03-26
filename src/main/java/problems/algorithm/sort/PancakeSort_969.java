package problems.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Search
 * @data 11:36 2019/3/26
 * �������
 */
public class PancakeSort_969 {

    /**
     * �Ӻ���ǰ������ÿ�ν��������ȷ�ת����ǰ��Ȼ�����巭תʹ����������ת����󣬲��ϵݹ�ʹ����������
     * @param A
     * @return
     */
    public List<Integer> pancakeSort(int[] A) {
        List<Integer> result = new ArrayList<>();
        for(int i = A.length - 1;i>0;i--){
            if(A[i] == i+1){
                continue;
            }
            for(int j = i-1;j>0;j--){
                if(A[j] == i+1){
                    flip(A,j);
                    result.add(j+1);
                }
            }
            flip(A,i);
            result.add(i+1);
        }
        return result;
    }

    /**
     * ��A[index]��ǰ��Ԫ�ؽ��з�ת
     * @param A
     * @param index
     */
    private void flip(int[] A,int index){
        if(index <= 0){
            return;
        }
        for(int i = 0;i<index;i++){
            int temp = A[i];
            A[i] = A[index];
            A[index--] = temp;
        }
    }
}

