package yaojnUtil;

public class CloneableUtilTest {

	/**
	 * ͨ���̳�ʵ�ֶԸ���������ǳ��¡
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TestSon objSon = new TestSon();
		TestSon objSon2 = (TestSon) objSon.clone();
		objSon2.changeInt();
		objSon2.changeDate();
		// �������͵�ǳ��¡
		System.out.println(objSon.getInt());
		System.out.println(objSon2.getInt());
		// �������͵����¡
		System.out.println(objSon.getDate());
		System.out.println(objSon2.getDate());
	}

}