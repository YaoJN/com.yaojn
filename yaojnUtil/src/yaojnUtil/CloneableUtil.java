package yaojnUtil;

import java.util.Date;

/**
 * 包含了基本数据类型与对象数据类型的克隆目标类
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
 * 为了实现对目标克隆的子类,其实现了Cloneable接口.
 */
class TestSon extends Testfoo implements Cloneable {
	// 重写克隆方法,返回一个具有新引用的对象.
	public Object clone() {
		Testfoo testObj = null;
		try {
			testObj = (Testfoo) super.clone();
		} catch (Exception e) {
			System.out.println("error");
		}
		// 对父类中的非基本类型进行克隆;
		testObj.setDate((Date) this.getDate().clone());
		return testObj;
	}
}
