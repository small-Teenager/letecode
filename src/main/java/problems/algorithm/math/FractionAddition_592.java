package problems.algorithm.math;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Search
 * @data 9:06 2019/2/14
 * 分数加减运算 592
 */
public class FractionAddition_592 {

    /**
     * 将给定的字符串分成单独的部分。根据+和-拆分字符串。
     * 按照它们出现在字符串中的顺序存储符号标志小号我克?阵列。
     * 在获得各个分数后，我们根据/符号进一步分割分数。获得了单独的分子和分母部分。我们存储相同的在一个? ü 中号和该d ? ?分别阵列。
     * @param expression
     * @return
     */
    public String fractionAddition(String expression) {

        List < Character > sign = new ArrayList < > ();
        for (int i = 1; i < expression.length(); i++) {
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-')
            { sign.add(expression.charAt(i));}
        }
        List < Integer > num = new ArrayList < > ();
        List < Integer > den = new ArrayList < > ();
        for (String sub: expression.split("\\+")) {
            for (String subsub: sub.split("-")) {
                if (subsub.length() > 0) {
                    String[] fraction = subsub.split("/");
                    num.add(Integer.parseInt(fraction[0]));
                    den.add(Integer.parseInt(fraction[1]));
                }
            }
        }
        if (expression.charAt(0) == '-')
        { num.set(0, -num.get(0));}
        int lcm = 1;
        for (int x: den) {
            lcm = lcm_(lcm, x);
        }

        int res = lcm / den.get(0) * num.get(0);
        for (int i = 1; i < num.size(); i++) {
            if (sign.get(i - 1) == '+')
            { res += lcm / den.get(i) * num.get(i);}
            else
            { res -= lcm / den.get(i) * num.get(i);}
        }
        int g = gcd(Math.abs(res), Math.abs(lcm));
        return (res / g) + "/" + (lcm / g);
    }

    public int lcm_(int a, int b) {
        return a * b / gcd(a, b);
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
