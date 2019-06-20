package problems.algorithm.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Search yaodong199@ciloud.com Í¬¹¹×Ö·û´®
 *
 */
public class IsIsomorphic_205 {
	
		
	/**
	 * map key-value
	 * @param s
	 * @param t
	 * @return
	 */
	  public boolean isIsomorphic(String s, String t) {
	        if(s.length() != t.length()){
	            return false;
	        }
	        
	        Map<Character, Character> map = new HashMap<>();
	        for(int i=0; i<s.length(); i++){
	            if(!map.containsKey(s.charAt(i))){
	                if(map.containsValue(t.charAt(i))){
	                    return false;
	                }
	                map.put(s.charAt(i), t.charAt(i));
	            }else{
	                if(map.get(s.charAt(i))!=t.charAt(i)){
	                    return false;
	                }
	            }
	        }
	        
	        return true;
	    }
}
