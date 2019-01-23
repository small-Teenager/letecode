package algorithm.math;
/**
 * @author Search
 * @data 9:32 2019/1/23
 * 第n个数字 400
 */
public class FindNthDigit_400 {

    /**
     * 无限整数序列组成的字符串中第n的数字？
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
