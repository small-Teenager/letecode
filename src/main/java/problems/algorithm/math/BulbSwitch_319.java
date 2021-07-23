package problems.algorithm.math;

/**
 * @author Search
 * @data 17:07 2019/3/18
 * 灯泡开关
 */
public class BulbSwitch_319 {
    public int bulbSwitch(int n) {
        return n<=0? 0: (int )Math.floor(Math.sqrt(n));
    }
}
