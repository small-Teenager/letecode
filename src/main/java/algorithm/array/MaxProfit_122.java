package algorithm.array;
/** 
* @author search 
* @version ����ʱ�䣺2018��5��7�� ����9:31:15 
* ��˵��  ������Ʊ�����ʱ��II
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
