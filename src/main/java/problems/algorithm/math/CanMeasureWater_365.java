package problems.algorithm.math;

/**
 * @author Search
 * @data 15:35 2019/4/4
 * 姘村６闂 365
 */
public class CanMeasureWater_365 {

    /**
     * ax + by = z
     * 鍗充负 x,y鐨勬渶澶у叕绾︽暟鑳藉惁z琚暣闄�
     * @param x
     * @param y
     * @param z
     * @return
     */
    public boolean canMeasureWater(int x, int y, int z) {
        if(z==0){return  true;}
        if(x+y<z){return false;}
        if(x==0){return y==z; }
        if(x>y){
            int temp=x;
            x=y;
            y=temp;
        }
        //鏈�澶у叕绾︽暟
        int val=x;
        while (y%x!=0){
            val=y%x;
            y=x;
           x=val;
        }
        return z%val==0;
    }
}
