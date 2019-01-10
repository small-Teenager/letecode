package algorithm.math;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Search
 * 分数到小数 166
 * @date 2019/1/10
 */
public class FractionToDecimal_166 {

    public String fractionToDecimal(int numerator, int denominator) {
        if (denominator == 0) {
            try {
                throw new Exception("denominator can't be zero");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (numerator == 0) {
            return "0";
        }
        StringBuilder builder = new StringBuilder();
        if ((numerator > 0 && denominator < 0) || (numerator < 0 && denominator > 0)) {
            builder.append('-');
        }

        // numerator/denominator may overflow
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        builder.append(num / den);
        num %= den;
        if (num == 0) {
            return builder.toString();
        }
        builder.append('.');

        Map<Long, Integer> map = new HashMap<>();
        while (num != 0 && !map.containsKey(num)) {
            map.put(num, builder.length());
            num *= 10;
            builder.append(num / den);
            num %= den;
        }
        if (map.containsKey(num)) {
            int tmp = map.get(num);
            builder.insert(tmp, '(');
            builder.append(')');
        }
        return builder.toString();
    }
}
