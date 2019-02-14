package algorithm.math;

/**
 * @author Search
 * @data 17:49 2019/2/14
 * 最大三角形面积 812
 */
public class LargestTriangleArea_812 {

    /**
     * 线性代数
     * 三个点组成2个向量
     * 如何去掉无用点？
     * @param points
     * @return
     */
    public  double largestTriangleArea(int[][] points) {
        //三个点构成两个共起点的向量。
        //两个向量可作平行四边形，面积是它们构成的行列式值的绝对值。
        //三角形面积是平行四边形面积的一半。
        //不需要回头：如果某个点p1曾被选中作为起点，那么在p2作为起点时，不需要考虑p1作为终点的情况。
        //理由：设第三个点p3,向量p1p2、p1p3构成的三角形和向量p2p1、p2p3构成的三角形是同一个。
        double s=0,x1,y1,x2,y2;
        int n= points.length;
        //选起点
        for(int i=0;i<n-2;i++)
        {
            //第一个向量的终点
            for(int j=i+1;j<n-1;j++)
            {
                x1=points[j][0]-points[i][0];
                y1=points[j][1]-points[i][1];
                //第二个向量的终点
                for(int k=j+1;k<n;k++)
                {
                    x2=points[k][0]-points[i][0];
                    y2=points[k][1]-points[i][1];
                    //行列式计算面积
                    s= Math.max(s,myabs(x1*y2-x2*y1));
                }
            }
        }
        return s/2;
    }
    public  double myabs(double x)
    {
        return x>=0? x:-x;
    }
}
