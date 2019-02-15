package problems.algorithm.math;
/**
 * @author Search
 * @data 9:22 2019/1/23
 * 字符串相加 415
 */
public class AddStrings_415 {
    /**
     * 我们使用char数组来维护每个索引处的数字。我们希望数组
     * 的大小为最大字符串+ 1，以便在最后处理进位。我们开始
     * 从末尾添加字符串的每个数字，并将它放在
     * sum数组末尾的正确索引中。这样，我们避免逆转它并在恒定
     * 时间内返回答案。注意通过添加“0”来转换计算的数字。最后，如果进位位
     * 为1，我们需要将第0个索引设为1，并使用sum数组返回该字符串。
     * 如果它不是1，那么sum数组有一个我们不想要的前导0。所以我们使用Java的
     * String构造函数接收char数组，该数组中的startingIndex和
     * 我们想要的那个数组的元素数量。因此，如果进位不是1，我们在技术上需要
     * 索引1和#ofof = sum.length - 1的所有内容，因为我们丢弃了0索引。
     * @param num1
     * @param num2
     * @return
     */
    public String addStrings(String num1, String num2) {
        if (num1.equals("0"))
            return num2;
        if (num2.equals("0"))
            return num1;

        char[] sum = new char[1 + Math.max(num1.length(), num2.length())];
        int index = sum.length - 1, idx1 = num1.length() - 1, idx2 = num2.length() - 1, carry = 0, total = 0;
        int n1, n2;
        while (idx1 >= 0 || idx2 >= 0) {
            n1 = idx1 < 0 ? 0 : num1.charAt(idx1--) - '0';
            n2 = idx2 < 0 ? 0 : num2.charAt(idx2--) - '0';
            total = n1 + n2 + carry;
            carry = total / 10;
            sum[index--] = (char) (total % 10 + '0');
        }
        if (carry == 1) {
            sum[0] = '1';
            return new String(sum);
        }
        return new String(sum, 1, sum.length - 1);
    }
}
