package problems.algorithm.array;

/**
 * @author Search
 * @version 1.0
 * @date 2019/9/12 14:56
 * 健身计划评估
 */
public class DietPlanPerformance_1176 {
    //v1
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int score = 0;
        int length = calories.length - k + 1;
        for (int i = 0; i < length; i++) {
            int sumCalOneK = 0;
            for (int j = i; j < (k + i); j++) {
                sumCalOneK += calories[j];
            }
            if (sumCalOneK < lower) {
                score--;
            } else if (sumCalOneK > upper) {
                score++;
            }
        }
        return score;
    }


    //v2
    public int dietPlanPerformancev2(int[] calories, int k, int lower, int upper) {
        int sum = 0;
        int grade = 0;
        for (int i = 0; i < calories.length; i++) {
            //保持窗口大小为k
            if (i > (k - 1)) {
                if (sum < lower) grade--;
                if (sum > upper) grade++;
                sum -= calories[i - k];

            }
            sum += calories[i];
        }
        //for 循环内未对最后一次符合条件情况做加减分判断
        if (calories.length - 1 >= k - 1) {
            if (sum < lower) grade--;
            if (sum > upper) grade++;
        }
        return grade;
    }

}
