package problems.algorithm.math;
/**
 * @author Search
 * @data 17:00 2019/1/24
 * 3鐨勫箓 326
 */
public class IsPowerOfThree_326 {

    /**
     * 3鐨勫箓
     * 浠�3涓哄簳鍙栧鏁扮粨鏋� =log(n)/log(3)涓�瀹氫负鏁存暟
     * @param n
     * @return
     */
    public boolean isPowerOfThree(int n) {
        double num = Math.log(n) / Math.log(3);
        if (num - (int) num == 0) {
            return true;
        }
        if (num - (int) num >= 0.99999999999999) {
            return true;
            //0.9999999999999991
        }
        return false;
    }
    /**
     * 浼樺寲method1
     * Math.log10(n)涓嶮ath.log(n)鍦╦ava涓繕鏄湁鍖哄埆鐨�
     *
     * @param n
     * @return
     */
    public boolean isPowerOfThree2(int n) {
        double a = Math.log10(n);
        double b = Math.log10(3);
        double res = a / b;
        return (res - (int) (res)) == 0;
    }
}
