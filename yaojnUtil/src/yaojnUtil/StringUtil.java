package yaojnUtil;

public class StringUtil {
	/**
	 * ͨ���ݹ鷽ʽ�����ַ�����ת
	 * 
	 * @param code
	 */
	public static String reversalStr(String str) {
		if (str == null || str.length() <= 1)
			return str;
		return reversalStr(str.substring(1)) + str.charAt(0);
	}
}