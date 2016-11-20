package yaojnUtil;

import java.util.Date;

/**
 * �����˻�����������������������͵Ŀ�¡Ŀ����
 */
class Testfoo {
	private int i = 0;
	private Date date = new Date();

	public void setInt(int i) {
		this.i = i;
	}

	public int getInt() {
		return i;
	}

	public void changeInt() {
		i = 1;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	@SuppressWarnings("deprecation")
	public void changeDate() {
		date.setMonth(0);
	}
}


/**
 * Ϊ��ʵ�ֶ�Ŀ���¡������,��ʵ����Cloneable�ӿ�.
 */
class TestSon extends Testfoo implements Cloneable {
	// ��д��¡����,����һ�����������õĶ���.
	public Object clone() {
		Testfoo testObj = null;
		try {
			testObj = (Testfoo) super.clone();
		} catch (Exception e) {
			System.out.println("error");
		}
		// �Ը����еķǻ������ͽ��п�¡;
		testObj.setDate((Date) this.getDate().clone());
		return testObj;
	}
}
