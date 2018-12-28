package algorithm.string;

import java.util.Arrays;
import java.util.List;

/**
 * 电话号码的字母组合
 * @author search
 * yaodong199@icloud.com
 */
public class LetterCombinations_17 {

 
    public List<String> letterCombinations(String digits) {
        String[] a = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        int solutions = digits.isEmpty() ? 0 : 1;
        
        for(int i = 0; i<digits.length(); i++) {
            solutions = solutions * a[digits.charAt(i) - '0'].length();
        }
        int combinations = solutions;
        String[] res = new String[solutions];
        for(int i = 0; i<digits.length(); i++) {
            String s = a[digits.charAt(i) - '0'];
            combinations = combinations/s.length();
            for (int j=0;j<solutions;j++){
                if (res[j] == null) {
                    res[j] = "";
                }
                res[j] += s.charAt( (j % (combinations * s.length())) / combinations);
            }    
        }
       return Arrays.asList(res);
    }
}
