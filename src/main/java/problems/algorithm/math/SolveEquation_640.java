package problems.algorithm.math;

/**
 * @author Search
 * @data 17:51 2019/2/12
 * 求解方程 640
 */
public class SolveEquation_640 {

    /**
     * 从等式中分割等号左右。使用int []表示x的累积系数和常数
     * @param equation
     * @return
     */
    public String solveEquation(String equation) {
        String left = equation.substring(0, equation.indexOf("="));
        String right = equation.substring(equation.indexOf("=") + 1);
        int[] l = process(left);
        int[] r = process(right);
        int[] v = new int[2];
        v[0] = l[0] - r[0];
        v[1] = r[1] - l[1];
        if (v[0] == 0 && v[1] == 0) {
            return "Infinite solutions";
        }
        if (v[0] == 0) {
            return "No solution";
        }
        return "x=" + (v[1] / v[0]);
    }

    public int[] process(String s) {
        int[] res = new int[2];
        int i = 0;
        int sign = 1;
        String t = "";
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == '+') {
                sign = 1;
            } else if (c == '-') {
                sign = -1;
            } else {
                int j = i;
                while (i + 1 < s.length() && (s.charAt(i + 1) != '+' && s.charAt(i + 1) != '-'))
                { i++;}
                if (s.charAt(i) == 'x') {
                    res[0] += sign * (i - j == 0 ? 1 : Integer.valueOf(s.substring(j, i)));
                } else {
                    res[1] += sign * Integer.valueOf(s.substring(j, i + 1));
                }
            }
            i++;
        }
        return res;
    }
}
