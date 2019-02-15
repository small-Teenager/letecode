package problems.algorithm.string;
/**
 * �ж�·�߳�Ȧ
 * @author search yaodong199@icloud.com
 */
public class JudgeCircle_657 {

	public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char move: moves.toCharArray()) {
            if (move == 'U') y--;
            else if (move == 'D') y++;
            else if (move == 'L') x--;
            else if (move == 'R') x++;
        }
        return x == 0 && y == 0;
    }
}
