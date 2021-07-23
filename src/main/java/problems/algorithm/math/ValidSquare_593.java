package problems.algorithm.math;

/**
 * @author Search
 * @data 9:37 2019/1/28
 * 鏈夋晥鐨勬鏂瑰舰 593
 */
public class ValidSquare_593 {


    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[][] points = {p1, p2, p3, p4};
        boolean[] used = new boolean[4];
        int[][] order = {p1, p2, p3, p4};

        return bt(points, used, order, 0);
    }


    boolean bt(int[][] points, boolean[] used, int[][] order, int k) {
        if (k == points.length) {
            return isSolution(order);
        }

        for (int i = 0; i < points.length; i++) {
            if (!used[i]) {
                used[i] = true;
                order[k] = points[i];
                if (bt(points, used, order, k + 1)) return true;
                used[i] = false;
            }
        }

        return false;
    }


    boolean isSolution(int[][] points) {
        //Use top left corner to right corder as reference
        double sameDist = dist(points[0], points[1]);
        if (sameDist == 0) return false;
        //Top right to bottom right
        if (dist(points[1], points[2]) != sameDist) return false;
        //Bottom right to bottom left
        if (dist(points[2], points[3]) != sameDist) return false;
        //Bottom left to top right
        if (dist(points[3], points[0]) != sameDist) return false;


        double diagonal = dist(points[0], points[2]);


        //AntiDiagonal
        if (dist(points[1], points[3]) != diagonal) return false;

        return true;
    }

    double dist(int[] p1, int[] p2) {
        int deltaX = p1[0] - p2[0];
        int deltaY = p1[1] - p2[1];

        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }


}
