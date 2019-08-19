package problems.algorithm.math;

/**
 * 两数相除
 * 
 * @author search yaodong199@icloud.com
 */
public class Divide_29 {

	
	public static void main(String args[]){
		Divide_29 a=new Divide_29();
		System.out.println(a.divide(22, 23));
	}
	/**
	 * 要求不能使用使用乘法、除法、mod运算符，so考虑>> || <<
	 * @param div
	 * @param dsor
	 * @return
	 */
	public int divide(int div, int dsor) {
		long MAX = 2147483647, MIN = -2147483648;
		char sign = div > 0 && dsor > 0 || div < 0 && dsor < 0 ? '+' : '-';
		long dividend = Math.abs((long) div);
		long divisor = Math.abs((long) dsor);
		long ret = 0;
		for (int i = 31; i >= 0; --i) {
			long t = (divisor << i);
			if (t < MIN || t > MAX + 1) {
				continue;
			}
			while (dividend >= t) {
				dividend -= t;
				ret += ((long) 1 << i);
			}
		}
		return sign == '+' ? (int) Math.min(ret, MAX) : (int) Math.max(-ret, MIN);
	}
}
