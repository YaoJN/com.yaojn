package yaojnUtil;

public class CloneableUtilTest {

	/**
	 * 通过继承实现对父类对象的深浅克隆
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TestSon objSon = new TestSon();
		TestSon objSon2 = (TestSon) objSon.clone();
		objSon2.changeInt();
		objSon2.changeDate();
		// 基本类型的浅克隆
		System.out.println(objSon.getInt());
		System.out.println(objSon2.getInt());
		// 对象类型的深克隆
		System.out.println(objSon.getDate());
		System.out.println(objSon2.getDate());
	}

}