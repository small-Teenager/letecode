package problems.algorithm.array;

/**
 * 
 * @author search 种花问题 605
 */
public class CanPlaceFlowers_605 {

	/**
	 * method 1 遍历数组 找到其中由多少个0 数组首位和末尾验证临界条件
	 * 
	 * @param flowerbed
	 * @param n
	 * @return
	 */
	public boolean canPlaceFlowers1(int[] flowerbed, int n) {
		int res = 0;
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
					&& (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
				flowerbed[i] = 1;
				res++;
			}
		}
		return res >= n;
	}

	// 优化method 1
	public boolean canPlaceFlowers2(int[] flowerbed, int n) {
		int res = 0;
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
					&& (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
				flowerbed[i] = 1;
				res++;
			}
			if (res >= n) {
				return true;
			}
		}
		return false;
	}
}
