package yaojnTest;

import java.util.Date;

public class TestCloneAble {

	/**
	 * 通过继承实现对父类对象的深浅克隆
	 * @param args
	 */
	public static void main(String[] args) {
		TestSon objSon = new TestSon();
		TestSon objSon2 = (TestSon) objSon.clone();
		objSon2.changeInt();
		objSon2.changeDate();
		System.out.println(objSon.getInt());
		System.out.println(objSon2.getInt());
		System.out.println(objSon.getDate());
	    System.out.println(objSon2.getDate());
	}
	
}

/**
 * 包含了基本数据类型与对象数据类型的克隆目标类
 */
class Testfoo{
	private int i = 0;
	private Date date = new Date();
	public void setInt(int i){
		this.i = i;
	} 
	public int getInt(){
		return i;
	}
	public void changeInt(){
		i = 1;
	}
	public void setDate(Date date){
		this.date = date;
	} 
	public Date getDate(){
		return date;
	}
	public void changeDate(){
		date.setMonth(0);
	}
}


/**
 * 为了实现对目标克隆的子类,其实现了Cloneable接口.
 */
class TestSon extends Testfoo implements Cloneable{
	//重写克隆方法,返回一个具有新引用的对象.
 	public Object clone(){
 		Testfoo testObj = null;
	try{
	testObj = (Testfoo)super.clone();
	}catch(Exception e){
		System.out.println("error");
	}
	//对父类中的非基本类型进行克隆;
	testObj.setDate((Date)this.getDate().clone());
	return testObj;
 	}
}
