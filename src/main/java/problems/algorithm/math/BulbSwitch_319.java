package problems.algorithm.math;

/**
 * @author Search
 * @data 17:07 2019/3/18
 * µÆÅÝ¿ª¹Ø
 */
public class BulbSwitch_319 {
    public int bulbSwitch(int n) {
        return n<=0? 0: (int )Math.floor(Math.sqrt(n));
    }
}
