package algorithm.math;

/**
 * @author Search
 * @data 17:40 2019/2/13
 * ���ų��� 553
 */
public class OptimalDivision_553 {

    /**
     * һ�����ŰѴӵڶ�������ʼ��������������
     * @param nums
     * @return
     */
   static  public String optimalDivision(int[] nums) {
        StringBuilder sb=new StringBuilder();
       if(1==nums.length){
          return sb.append(nums[0]).toString();
       }
        for(int i=0;i<nums.length;i++){
            sb.append(nums[i]);
            if(i==nums.length-1){break;}
            sb.append("/");
            if(i==0&&nums.length>2){
                sb.append("(");
            }
        }

        if(nums.length>2){
            sb.append(")");
        }

        return sb.toString();
    }


    public static void main(String args[]){
int nums[]={2,3};
        System.out.println(optimalDivision(nums));

    }
}
