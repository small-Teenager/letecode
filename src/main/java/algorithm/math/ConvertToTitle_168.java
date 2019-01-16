package algorithm.math;

/**
 * @author Search
 * @date 2019/1/16
 * excel ±íÁÐÃû³Æ 168
 */
public class ConvertToTitle_168 {

    public String convertToTitle(int n) {
        int power = 1;
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            if (power == 1) {
                int temp = n % 26;
                temp = temp == 0 ? 26 : temp;
                sb.append((char) (temp + 64));
                n -= temp;

            } else {
                int temp = n / power;
                if (temp <= 26) {
                    sb.append((char) (temp + 64));
                    break;
                } else {
                    sb.append((char) ((temp % 26) + 64));
                    n -= (temp % 26) * power;
                }
            }
            power *= 26;
        }
        return sb.reverse().toString();
    }
}
