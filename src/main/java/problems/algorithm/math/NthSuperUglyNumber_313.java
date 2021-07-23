package problems.algorithm.math;
/**
 * @author Search
 * @data 9:53 2019/1/25
 * 瓒呯骇涓戞暟 313
 */
public class NthSuperUglyNumber_313 {

    public int nthSuperUglyNumber(int n, int[] primes) {
        //dp[i]鐢眒in{primes[j] * dp[index[j]]},j=[0,n)寰楀埌
        int[] index = new int[primes.length],dp = new int[n];
        int i = 1;
        dp[0] = 1;
        while(i < n){
            int j = 0,min = Integer.MAX_VALUE;
            for(int num:primes){
                if(num * dp[index[j]] < min) min = num * dp[index[j]];
                j++;
            }
            dp[i] = min;
            j = 0;
            for(int num:primes){
                if(min == num * dp[index[j]]) index[j]++;
                j++;
            }
            i++;
        }
        return dp[dp.length - 1];
    }
}
