package problems.algorithm.math;

/**
 * @author Search
 * @data 15:35 2019/4/4
 * 水壶问题 365
 */
public class CanMeasureWater_365 {

    /**
     * ax + by = z
     * 即为 x,y的最大公约数能否z被整除
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
        //最大公约数
        int val=x;
        while (y%x!=0){
            val=y%x;
            y=x;
           x=val;
        }
        return z%val==0;
    }
}
