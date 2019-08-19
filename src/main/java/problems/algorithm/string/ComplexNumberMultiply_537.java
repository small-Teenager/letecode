package problems.algorithm.string;

/**
 * 537. 复数乘法
 * 
 * @author search yaodong199@icloud.com
 */
public class ComplexNumberMultiply_537 {
	/**
	 * 将输入字符串'a+bi'拆分成字符串'a'和字符串'b'
	 * @param a
	 * @param b
	 * @return
	 */
	public String complexNumberMultiply(String a, String b) {
		String x[] = a.split("\\+|i");
		String y[] = b.split("\\+|i");
		int a_real = Integer.parseInt(x[0]);
		int a_img = Integer.parseInt(x[1]);
		int b_real = Integer.parseInt(y[0]);
		int b_img = Integer.parseInt(y[1]);
		//i^2=-1  (a+bi)*(c+di)=(ac-bd)+(ad+bc)i
		return (a_real * b_real - a_img * b_img) + "+" + (a_real * b_img + a_img * b_real) + "i";

	}
}
