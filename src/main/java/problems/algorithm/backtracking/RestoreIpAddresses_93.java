package problems.algorithm.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 93. 复原IP地址
 * @author search
 *
 */
public class RestoreIpAddresses_93 {

	//v1 暴力破解 
	 public List<String> restoreIpAddresses(String s) {
	        List<String> res = new ArrayList<>();
	        int n = s.length();
	        for (int i = 0; i < 3; i++) {
	            for (int j = i + 1; j < i + 4; j++) {
	                for (int k = j + 1; k < j + 4; k++) {
	                    if (i < n && j < n && k < n) {
	                        String tmp1 = s.substring(0, i + 1);
	                        String tmp2 = s.substring(i + 1, j + 1);
	                        String tmp3 = s.substring(j + 1, k + 1);
	                        String tmp4 = s.substring(k + 1);
	                        if (helper(tmp1) && helper(tmp2) && helper(tmp3) && helper(tmp4))
	                            res.add(tmp1 + "." + tmp2 + "." + tmp3 + "." + tmp4);
	                    }
	                }
	            }
	        }
	        return res;
	    }

	    private boolean helper(String tmp) {
	        if (tmp == null || tmp.length() == 0 || tmp.length() > 3 || (tmp.charAt(0) == '0' && tmp.length() > 1) || Integer.parseInt(tmp) > 255)
	            return false;
	        return true;
	    }
	    
	    //v2 回溯
	    public List<String> restoreIpAddressesv2(String s) {
	        List<String> res = new ArrayList<>();
	        int n = s.length();
	        backtrack(0, "", 4, s, res, n);
	        return res;
	    }

	    private void backtrack(int i, String tmp, int flag, String s, List<String> res, int n) {
	        if (i == n && flag == 0) {
	            res.add(tmp.substring(0, tmp.length() - 1));
	            return;
	        }
	        if (flag < 0) return;
	        for (int j = i; j < i + 3; j++) {
	            if (j < n) {
	                if (i == j && s.charAt(j) == '0') {
	                    backtrack(j + 1, tmp + s.charAt(j) + ".", flag - 1, s, res, n);
	                    break;
	                }
	                if (Integer.parseInt(s.substring(i, j + 1)) <= 255)
	                    backtrack(j + 1, tmp + s.substring(i, j + 1) + ".", flag - 1, s, res, n);
	            }
	        }
	    }




}
