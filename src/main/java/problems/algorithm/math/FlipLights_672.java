package problems.algorithm.math;

/**
 * @author Search
 * @data 14:41 2019/2/15
 * 灯泡开关II 672
 */
public class FlipLights_672 {

    /**
     *
     * @param n
     * @param m
     * @return
     */
    public int flipLights(int n, int m) {
        if(m==0){ return 1;}
        if(n==1) {return 2;}
        if(n==2&&m==1) {return 3;}
        if(n==2) {return 4;}
        if(m==1) {return 4;}
        if(m==2) {return 7;}
//        if(m>=3) return 8;
        return 8;
    }
}
