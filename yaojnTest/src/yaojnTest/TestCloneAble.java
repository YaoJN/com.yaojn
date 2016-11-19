package yaojnTest;

import java.util.Date;

public class TestCloneAble {

	/**
	 * ͨ���̳�ʵ�ֶԸ���������ǳ��¡
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
 * �����˻�����������������������͵Ŀ�¡Ŀ����
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
 * Ϊ��ʵ�ֶ�Ŀ���¡������,��ʵ����Cloneable�ӿ�.
 */
class TestSon extends Testfoo implements Cloneable{
	//��д��¡����,����һ�����������õĶ���.
 	public Object clone(){
 		Testfoo testObj = null;
	try{
	testObj = (Testfoo)super.clone();
	}catch(Exception e){
		System.out.println("error");
	}
	//�Ը����еķǻ������ͽ��п�¡;
	testObj.setDate((Date)this.getDate().clone());
	return testObj;
 	}
}
