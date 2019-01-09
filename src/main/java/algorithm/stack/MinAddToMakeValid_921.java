package algorithm.stack;

import java.util.Stack;

/**
 * @author Search
 * @date 2019/1/9
 * ʹ������Ч����С��� 921
 */
public class MinAddToMakeValid_921 {

    /**
     * ȥ�����е���Ч���ţ����µļ�Ϊ������ӵ�����������
     *
     */

    /**
     * balance
     *
     * @param S
     * @return
     */
    public int minAddToMakeValid(String S) {
        int ans = 0, bal = 0;
        for (int i = 0; i < S.length(); ++i) {
            bal += S.charAt(i) == '(' ? 1 : -1;
            // It is guaranteed bal >= -1
            if (bal == -1) {
                ans++;
                bal++;
            }
        }

        return ans + bal;
    }

    /**
     * stack
     *
     * @param S
     * @return
     */
    public int minAddToMakeValid2(String S) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push('(');
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    continue;
                } else {
                    stack.pop();
                    count += 2;
                }
            }
        }
        return S.length() - count;

    }
}
