package problems.algorithm.math;

/**
 * @author Search
 * @data 16:42 2019/1/28
 * 澧炲噺瀛楃涓插尮閰� 942
 */
public class DiStringMatch_942{

    public int[] diStringMatch(String S) {
        int[] res=new int[S.length()+1];
        int a=0,b=S.length();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='I'){
                res[i]=a++;
                if(i==S.length()-1){
                    res[i+1]=a++;
                }
            }
            if(S.charAt(i)=='D'){
                res[i]=b--;
                if(i==S.length()-1){
                    res[i+1]=b--;
                }
            }
        }
        return res;
    }
}
