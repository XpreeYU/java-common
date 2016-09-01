package io.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 将序列化的对象写入文件
 * @author yujiansong
 *
 */
public class SerializeDemo {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Reyan Ali";
		e.address = "Phokka Kuan, Ambehta Peer";
		e.SSN = 11122333;
		e.number = 101;
		
		try {
			FileOutputStream fileOut = new FileOutputStream("C:\\Temp\\employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in C:\\Temp\\employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}