package yaojnUtil;

import java.io.Serializable;

public class CloneUtilTest {
	public static void main(String[] args) {
		try {
			Person p1 = new Person("Hao LUO", 33, new Car("Benz", 300));
			Person p2 = CloneUtil.clone(p1); // ��ȿ�¡
			p2.getCar().setBrand("BYD");
			// �޸Ŀ�¡��Person����p2���������������Ʒ������
			// ԭ����Person����p1���������������ܵ��κ�Ӱ��
			// ��Ϊ�ڿ�¡Person����ʱ���������������Ҳ����¡��
			System.out.println(p1);
			System.out.println(p2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/**
 * ����
 * 
 * @author ���
 *
 */
class Person implements Serializable {
	private static final long serialVersionUID = -9102017020286042305L;

	private String name; // ����
	private int age; // ����
	private Car car; // ����

	public Person(String name, int age, Car car) {
		this.name = name;
		this.age = age;
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
	}

}

/**
 * С������
 * 
 * @author ���
 *
 */
class Car implements Serializable {
	private static final long serialVersionUID = -5713945027627603702L;

	private String brand; // Ʒ��
	private int maxSpeed; // ���ʱ��

	public Car(String brand, int maxSpeed) {
		this.brand = brand;
		this.maxSpeed = maxSpeed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", maxSpeed=" + maxSpeed + "]";
	}

}
