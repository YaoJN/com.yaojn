package yaojnUtil;

public class StringUtil {
	/**
	 * 通过递归方式进行字符串反转
	 * 
	 * @param code
	 */
	public static String reversalStr(String str) {
		if (str == null || str.length() <= 1)
			return str;
		return reversalStr(str.substring(1)) + str.charAt(0);
	}
}