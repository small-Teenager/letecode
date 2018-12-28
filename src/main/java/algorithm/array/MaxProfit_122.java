package algorithm.array;
/** 
* @author search 
* @version 创建时间：2018年5月7日 上午9:31:15 
* 类说明  买卖股票的最佳时机II
*/
public class MaxProfit_122 {
	public int maxProfit(int[] prices) {
		if(prices.length==0){
            return 0;
        }
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}
