package problems.algorithm.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * @author Search yaodong199@ciloud.com 字母异位词分组
 *
 */
public class GroupAnagrams_49 {
	
	//V1 寻找相同的映射
	public List<List<String>> groupAnagrams(String[] strs) {
	    HashMap<String, List<String>> hash = new HashMap<>();
	    for (int i = 0; i < strs.length; i++) {
	        char[] s_arr = strs[i].toCharArray();
	        //排序
	        Arrays.sort(s_arr);
	        //映射到 key
	        String key = String.valueOf(s_arr); 
	        //添加到对应的类中
	        if (hash.containsKey(key)) {
	            hash.get(key).add(strs[i]);
	        } else {
	            List<String> temp = new ArrayList<String>();
	            temp.add(strs[i]);
	            hash.put(key, temp);
	        }

	    }
	    return new ArrayList<List<String>>(hash.values()); 
	}

}
