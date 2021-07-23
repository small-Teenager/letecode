package problems.algorithm.recursion;
/**
 * @author Search
 * @data 14:34 2019/1/25
 * 687. 鏈�闀垮悓鍊艰矾寰�
 */
public class LongestUnivaluePath_687 {
}

/**
 * Definition for a binary tree node.*/
class TreeNode {
    int val;
  TreeNode left;
  TreeNode right;
   TreeNode(int x) { val = x; }
  }

class Solution {
    private int maxL = 0;

    public int longestUnivaluePath(TreeNode root) {
        /**
         瑙ｉ鎬濊矾绫讳技浜�124棰�, 瀵逛簬浠绘剰涓�涓妭鐐�, 濡傛灉鏈�闀垮悓鍊艰矾寰勫寘鍚鑺傜偣, 閭ｄ箞鍙彲鑳芥槸涓ょ鎯呭喌:
         1. 鍏跺乏鍙冲瓙鏍戜腑鍔犱笂璇ヨ妭鐐瑰悗鎵�鏋勬垚鐨勫悓鍊艰矾寰勪腑杈冮暱鐨勯偅涓户缁悜鐖惰妭鐐瑰洖婧瀯鎴愭渶闀垮悓鍊艰矾寰�
         2. 宸﹀彸瀛愭爲鍔犱笂璇ヨ妭鐐归兘鍦ㄦ渶闀垮悓鍊艰矾寰勪腑, 鏋勬垚浜嗘渶缁堢殑鏈�闀垮悓鍊艰矾寰�
         闇�瑕佹敞鎰忓洜涓鸿姹傚悓鍊�, 鎵�浠ュ湪鍒ゆ柇宸﹀彸瀛愭爲鑳芥瀯鎴愮殑鍚屽�艰矾寰勬椂瑕佸姞鍏ュ綋鍓嶈妭鐐圭殑鍊间綔涓哄垽鏂緷鎹�
         **/
        if(root == null) return 0;
        getMaxL(root, root.val);
        return maxL;
    }

    private int getMaxL(TreeNode r, int val) {
        if(r == null) return 0;
        int left = getMaxL(r.left, r.val);
        int right = getMaxL(r.right, r.val);
        // 璺緞闀垮害涓鸿妭鐐规暟鍑�1鎵�浠ユ澶勪笉鍔�1
        maxL = Math.max(maxL, left+right);
        // 鍜岀埗鑺傜偣鍊肩浉鍚屾墠杩斿洖浠ュ綋鍓嶈妭鐐规墍鑳芥瀯鎴愮殑鏈�闀块�氱煡璺緞闀垮害, 鍚﹀垯杩斿洖0
        if(r.val == val)
            return Math.max(left, right) + 1;
        return 0;
    }
}