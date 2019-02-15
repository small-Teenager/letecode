package problems.algorithm.array;
/** 
* @author search 
* @version ����ʱ�䣺2018��5��6�� ����7:47:41 
* ��˵��  ������Ʊ�����ʱ��
*/
public class MaxProfit_121 {
	public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
}
