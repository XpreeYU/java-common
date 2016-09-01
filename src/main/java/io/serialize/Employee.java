package io.serialize;

/**
 * 创建一个对象，实现序列化
 * 
 * @author yujiansong
 *
 */
public class Employee implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	public String name;
	public String address;
	
	//该属性为临时属性，将不进行序列化操作
	public transient int SSN;
	public int number;

	public void mailCheck() {
		System.out.println("Mailing a check to " + name + " " + address);
	}

}