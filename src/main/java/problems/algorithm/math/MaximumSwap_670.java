package problems.algorithm.math;
import java.util.LinkedList;

/**
 * @author Search
 * @data 13:26 2019/1/28
 * 鏈�澶т氦鎹� 670
 */
public class MaximumSwap_670 {
    /**
     * 宸︽暩绗簩浣嶆渶澶у�� 鍜岀涓�浣嶄氦鎻涗綅缃鏋滅涓�浣嶅皬
     * @param num
     * @return
     */
    public int maximumSwap(int num) {
        LinkedList<Integer> nl = new LinkedList<>();
        while (num > 0){
            nl.addFirst(num%10);
            num/=10;
        }
        for (int i=0; i<nl.size(); i++){

            int max = -1, pos = i;
            for (int j=i+1; j<nl.size(); j++){
                if (nl.get(j)>=max) {
                    max = nl.get(j);
                    pos = j;
                }
            }
            if (max > nl.get(i)){
                int temp = nl.get(i);
                nl.set(i, nl.get(pos));
                nl.set(pos, temp);
                break;
            }
        }
        int res = 0, pow = 1;
        for (int i = nl.size()-1; i>=0; i--){
            res += pow * nl.get(i);
            pow *= 10;
        }
        return res;
    }
}
