package problems.algorithm.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Search
 * @data 16:34 2019/3/18
 * 旋转矩阵
 */
public class SpiralOrder_54 {
    /**
     * 顺序返回矩阵的所有元素
     * @param matrix
     * @return
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList();
        if(matrix.length==0){
            return list;
        }
        int i,j;
        int di=0,dj=0;
        int width=matrix[0].length;
        int height=matrix.length;
        while(di*2<width&&dj*2<height){
            for(i=di;i<width-di;i++){
                list.add(matrix[dj][i]);
            }
            for(j=dj+1;j<height-di;j++){
                list.add(matrix[j][width-di-1]);
            }
            if(height-dj-1!=dj) {
                for(i=i-2;i>=di;i--){
                    list.add(matrix[height-dj-1][i]);
                }
            }
            if(width-di-1!=di) {
                for(j=j-2;j>dj;j--){
                    list.add(matrix[j][di]);
                }}
            di++;
            dj++;
        }
        return list;
    }

}
