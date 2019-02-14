package algorithm.math;

/**
 * @author Search
 * @data 17:49 2019/2/14
 * ������������ 812
 */
public class LargestTriangleArea_812 {

    /**
     * ���Դ���
     * ���������2������
     * ���ȥ�����õ㣿
     * @param points
     * @return
     */
    public  double largestTriangleArea(int[][] points) {
        //�����㹹������������������
        //������������ƽ���ı��Σ���������ǹ��ɵ�����ʽֵ�ľ���ֵ��
        //�����������ƽ���ı��������һ�롣
        //����Ҫ��ͷ�����ĳ����p1����ѡ����Ϊ��㣬��ô��p2��Ϊ���ʱ������Ҫ����p1��Ϊ�յ�������
        //���ɣ����������p3,����p1p2��p1p3���ɵ������κ�����p2p1��p2p3���ɵ���������ͬһ����
        double s=0,x1,y1,x2,y2;
        int n= points.length;
        //ѡ���
        for(int i=0;i<n-2;i++)
        {
            //��һ���������յ�
            for(int j=i+1;j<n-1;j++)
            {
                x1=points[j][0]-points[i][0];
                y1=points[j][1]-points[i][1];
                //�ڶ����������յ�
                for(int k=j+1;k<n;k++)
                {
                    x2=points[k][0]-points[i][0];
                    y2=points[k][1]-points[i][1];
                    //����ʽ�������
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
