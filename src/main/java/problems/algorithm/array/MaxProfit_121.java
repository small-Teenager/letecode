package problems.algorithm.array;
/** 
* @author search 
* @version 创建时间：2018年5月6日 下午7:47:41 
* 类说明  买卖股票的最佳时机
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
