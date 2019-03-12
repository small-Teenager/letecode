package problems.algorithm.math;

import java.util.HashMap;

/**
 * @author Search
 * @data 9:01 2019/3/12
 * 535. TinyURL 的加密与解密
 */
public class Codec_535 {
    String alphas ="abcdefghijklmnopqrstuvwxyz0123456789";
    int base=36;
    long counter=1;
    HashMap<String, String> map = new HashMap<>();

    private String generateString(){
        long cur=counter;
        counter++;
        StringBuilder sb = new StringBuilder();
        while(cur>0){
            sb.append(alphas.charAt((int)(cur%base)));
            cur=cur/base;
        }
        return sb.toString();
    }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String hash = generateString();
        map.put(hash, longUrl);
        return hash;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }

    public static void main(String args[]){
        Codec_535 a=new Codec_535();
        System.out.println(a.encode("https://leetcode.com/problems/design-tinyurl"));
        System.out.println(a.decode("b"));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));