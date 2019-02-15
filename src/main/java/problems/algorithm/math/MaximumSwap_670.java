package problems.algorithm.math;
import java.util.LinkedList;

/**
 * @author Search
 * @data 13:26 2019/1/28
 * 最大交换 670
 */
public class MaximumSwap_670 {
    /**
     * 左數第二位最大值 和第一位交換位置如果第一位小
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
