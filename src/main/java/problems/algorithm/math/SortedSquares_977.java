package problems.algorithm.math;

import java.util.Arrays;

/**
 * @author Search
 * @date 2019/1/20
 * 有序数组的平方 977
 */
public class SortedSquares_977 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { -7, -3, 2, 3, 11 };

		System.out.println(sortedSquares(a));
	}
	
	public static int[] sortedSquares(int[] A) {

		for (int i = 0; i < A.length; i++) {
			A[i] *= A[i];
		}
		Arrays.sort(A);
		return A;
	}
	
	//V2数组有序，则数组的第一个元素的平方与最后一个元素的平方中的最大值一定为整个数组的最大值，故给定2个指针，一个为从0开始，一个为最大值
	public int[] sortedSquaresV2(int[] A) {
        int maxIndex = A.length;
        int beforeIndex = 0;
        int afterIndex = maxIndex-1;
        int head = maxIndex-1;
        int[] resultArr = new int[maxIndex];
        while(beforeIndex != afterIndex){
            if(A[beforeIndex]*A[beforeIndex] >= A[afterIndex]*A[afterIndex]){
                resultArr[head--] = A[beforeIndex]*A[beforeIndex++];
            }else{
                resultArr[head--] = A[afterIndex]*A[afterIndex--];
            }
        }
        resultArr[0] = A[beforeIndex]*A[beforeIndex];
        return resultArr;
    }


}
