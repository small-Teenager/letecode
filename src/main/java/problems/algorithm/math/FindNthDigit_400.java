package problems.algorithm.math;
/**
 * @author Search
 * @data 9:32 2019/1/23
 * 绗琻涓暟瀛� 400
 */
public class FindNthDigit_400 {

    /**
     * 鏃犻檺鏁存暟搴忓垪缁勬垚鐨勫瓧绗︿覆涓n鐨勬暟瀛楋紵
     *
     * @param n
     * @return
     */
    public int findNthDigit(int n) {
        n--;
        int start = 1;
        int size = 1;
        while (n / 9 / size >= start) {
            n -= 9 * start * size;
            start *= 10;
            size++;
        }

        int number = start + n / size;
        for (int i = n % size; i < size - 1; i++) {
            number /= 10;
        }
        return number % 10;
    }
}
