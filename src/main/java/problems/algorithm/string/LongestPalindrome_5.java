package problems.algorithm.string;
/** 
* @author search 
* @version 创建时间：2018年5月6日 下午3:46:55 
* 类说明  最长回文子串
*/
public class LongestPalindrome_5 {
	 public String longestPalindrome(String s) {
			if(s==null||s.length()==0)return null;
			 int n = s.length();
			  for (int i = n; i>0; i--) {		    
				for(int j = 0; j<=n-i; j++) {
				  if(isPalindrome(s.substring(j, j+i))) 
				    return s.substring(j, j+i);
						}
			  }
			  return null;
		        
		    }
		    /**
		     * boolean isPalindrome
		     * @param s
		     * @return
		     */
		    public  boolean isPalindrome(String s){
		        if(s==null||s.length()==0)return false;
		        int n = s.length();
		          for(int i=0; i<=n/2; i++) {  
		            if(s.charAt(i) != s.charAt(n-i-1)) return false; 
		          }
		          return true;	

		    }
}
