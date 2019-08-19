package problems.algorithm.math;
/**
 * @author Search
 * @data 9:22 2019/1/23
 * 瀛楃涓茬浉鍔� 415
 */
public class AddStrings_415 {
    /**
     * 鎴戜滑浣跨敤char鏁扮粍鏉ョ淮鎶ゆ瘡涓储寮曞鐨勬暟瀛椼�傛垜浠笇鏈涙暟缁�
     * 鐨勫ぇ灏忎负鏈�澶у瓧绗︿覆+ 1锛屼互渚垮湪鏈�鍚庡鐞嗚繘浣嶃�傛垜浠紑濮�
     * 浠庢湯灏炬坊鍔犲瓧绗︿覆鐨勬瘡涓暟瀛楋紝骞跺皢瀹冩斁鍦�
     * sum鏁扮粍鏈熬鐨勬纭储寮曚腑銆傝繖鏍凤紝鎴戜滑閬垮厤閫嗚浆瀹冨苟鍦ㄦ亽瀹�
     * 鏃堕棿鍐呰繑鍥炵瓟妗堛�傛敞鎰忛�氳繃娣诲姞鈥�0鈥濇潵杞崲璁＄畻鐨勬暟瀛椼�傛渶鍚庯紝濡傛灉杩涗綅浣�
     * 涓�1锛屾垜浠渶瑕佸皢绗�0涓储寮曡涓�1锛屽苟浣跨敤sum鏁扮粍杩斿洖璇ュ瓧绗︿覆銆�
     * 濡傛灉瀹冧笉鏄�1锛岄偅涔坰um鏁扮粍鏈変竴涓垜浠笉鎯宠鐨勫墠瀵�0銆傛墍浠ユ垜浠娇鐢↗ava鐨�
     * String鏋勯�犲嚱鏁版帴鏀禼har鏁扮粍锛岃鏁扮粍涓殑startingIndex鍜�
     * 鎴戜滑鎯宠鐨勯偅涓暟缁勭殑鍏冪礌鏁伴噺銆傚洜姝わ紝濡傛灉杩涗綅涓嶆槸1锛屾垜浠湪鎶�鏈笂闇�瑕�
     * 绱㈠紩1鍜�#ofof = sum.length - 1鐨勬墍鏈夊唴瀹癸紝鍥犱负鎴戜滑涓㈠純浜�0绱㈠紩銆�
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
