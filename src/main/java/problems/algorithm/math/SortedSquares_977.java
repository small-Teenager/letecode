package problems.algorithm.math;

import java.util.Arrays;

/**
 * @author Search
 * @date 2019/1/20
 * 鏈夊簭鏁扮粍鐨勫钩鏂� 977
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
	
	//V2鏁扮粍鏈夊簭锛屽垯鏁扮粍鐨勭涓�涓厓绱犵殑骞虫柟涓庢渶鍚庝竴涓厓绱犵殑骞虫柟涓殑鏈�澶у�间竴瀹氫负鏁翠釜鏁扮粍鐨勬渶澶у�硷紝鏁呯粰瀹�2涓寚閽堬紝涓�涓负浠�0寮�濮嬶紝涓�涓负鏈�澶у��
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
