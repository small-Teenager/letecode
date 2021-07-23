package problems.algorithm.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Search
 * 括号生成 22
 * @date 2019/1/10
 */
public class GenerateParenthesis_22 {


    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList();
        if (n == 0) {
            ans.add("");
        } else {
            for (int c = 0; c < n; ++c) {
                for (String left : generateParenthesis(c)) {
                    for (String right : generateParenthesis(n - 1 - c)) {
                        ans.add("(" + left + ")" + right);
                    }
                }
            }
        }
        return ans;
    }
}



