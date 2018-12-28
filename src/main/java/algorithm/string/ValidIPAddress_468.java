package algorithm.string;

/**
 * 验证 ip 地址
 * 
 * @author search yaodong199@icloud.com
 */
public class ValidIPAddress_468 {

	/**
	 * method 1
	 * 
	 * @param IP
	 * @return
	 */
	public String validIPAddress(String IP) {
		if (isValidIPv4(IP))
			return "IPv4";
		else if (isValidIPv6(IP))
			return "IPv6";
		else
			return "Neither";
	}

	public boolean isValidIPv4(String ip) {
		if (ip.length() < 7)
			return false;
		if (ip.charAt(0) == '.')
			return false;
		if (ip.charAt(ip.length() - 1) == '.')
			return false;
		String[] tokens = ip.split("\\.");
		if (tokens.length != 4)
			return false;
		for (String token : tokens) {
			if (!isValidIPv4Token(token))
				return false;
		}
		return true;
	}

	public boolean isValidIPv4Token(String token) {
		if (token.startsWith("0") && token.length() > 1)
			return false;
		try {
			int parsedInt = Integer.parseInt(token);
			if (parsedInt < 0 || parsedInt > 255)
				return false;
			if (parsedInt == 0 && token.charAt(0) != '0')
				return false;
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public boolean isValidIPv6(String ip) {
		if (ip.length() < 15)
			return false;
		if (ip.charAt(0) == ':')
			return false;
		if (ip.charAt(ip.length() - 1) == ':')
			return false;
		String[] tokens = ip.split(":");
		if (tokens.length != 8)
			return false;
		for (String token : tokens) {
			if (!isValidIPv6Token(token))
				return false;
		}
		return true;
	}

	public boolean isValidIPv6Token(String token) {
		if (token.length() > 4 || token.length() == 0)
			return false;
		char[] chars = token.toCharArray();
		for (char c : chars) {
			boolean isDigit = c >= 48 && c <= 57;
			boolean isUppercaseAF = c >= 65 && c <= 70;
			boolean isLowerCaseAF = c >= 97 && c <= 102;
			if (!(isDigit || isUppercaseAF || isLowerCaseAF))
				return false;
		}
		return true;
	}

	/***
	 * method 2 正则验证
	 * 
	 * @param IP
	 * @return
	 */
	public String validIPAddress2(String IP) {
		if (IP.matches(
				"(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])"))
			return "IPv4";
		else if (IP.matches("(([0-9a-fA-F]{1,4}):){7}([0-9a-fA-F]{1,4})"))
			return "IPv6";
		else
			return "Neither";
	}
}
