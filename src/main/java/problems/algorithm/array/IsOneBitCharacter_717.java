package problems.algorithm.array;

/**
 * 717. 1比特与2比特字符
 * 
 * @author search yaodong199@icloud.com
 */
public class IsOneBitCharacter_717 {
	/**
	 * method 1
	 * @param bits
	 * @return
	 */
	public boolean isOneBitCharacter1(int[] bits) {
		int i = 0;
		while (i < bits.length - 1) {
			i += bits[i] + 1;
		}
		return i == bits.length - 1;
	}
	 /**
	  *  method 2
	  * @param bits
	  * @return
	  */
	public boolean isOneBitCharacter2(int[] bits) {
		int i = bits.length - 2;
		while (i >= 0 && bits[i] > 0)
			i--;
		return (bits.length - i) % 2 == 0;
	}
}
