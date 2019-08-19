package problems.algorithm.math;

/**
 * @author Search
 * @data 9:47 2019/2/14
 * 到达终点数字 754
 */
public class ReachNumber_754 {
    /**
     * sum ：1+2+3...+n
     * sum=n(n+1)/2
     * n=sqrt(2sum-0.25)-0.5
     * n = (sqrt(8m-1)-1)/2
     *
     * @param target
     * @return
     */

    public int reachNumber(int target) {

        int n=(int)Math.ceil((Math.sqrt(8.00*Math.abs(target)+1)-1)/2);
        return ((n&1^1&n>>1^target&1)<<(n&1))+n;
    }

    public int reachNumber2(int target) {
        if(target==0)
        { return 0;}
        if(target<0) {
            target = -target;
        }
        int n = (int)(Math.sqrt(2*target+0.25)-0.5);

        while(true){
            long num = n*(1+n)/2-target;
            if(num>=0 && num%2==0) {
                return n;
            }n++;
        }
    }
}

