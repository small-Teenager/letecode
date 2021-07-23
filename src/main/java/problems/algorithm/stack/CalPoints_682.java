package problems.algorithm.stack;

import java.util.Stack;

/**
 * @author Search
 * 棒球比赛 682
 * @date 2019/1/7
 */
public class CalPoints_682 {
    /**
     * 遍历数组
     * @param ops
     * @return
     */
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack();

        for (String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
        }

        int ans = 0;
        for (int score : stack) {
            ans += score;
        }
        return ans;
    }
}
