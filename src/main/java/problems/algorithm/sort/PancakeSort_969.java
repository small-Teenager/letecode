package problems.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Search
 * @data 11:36 2019/3/26
 * 煎饼排序
 */
public class PancakeSort_969 {

    /**
     * 从后往前遍历，每次将最大的数先翻转到最前，然后整体翻转使得最大的数翻转到最后，不断递归使得整体升序
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
     * 将A[index]以前的元素进行翻转
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

