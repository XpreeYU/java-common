package util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * @title SerializeUtil
 *
 * @explain 序列化工具类
 * @author yujiansong
 * @date 2016年9月7日
 */
public class SerializeUtil {
	
	/**
	 * 序列化JAVA对象
	 * @param obj
	 * @return
	 */
	public static byte[] serialize(Object obj) throws Exception{
		if(obj == null) return null;
		ObjectOutputStream oos = null;
		ByteArrayOutputStream baos = null;
		byte[] bytes = null;
		try{
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(obj);
			bytes = baos.toByteArray();
			
		}catch(Exception e) {
			throw new Exception("序列化出错：" + e);
		}
		return bytes;
	}
	
	/**
	 * 反序列化
	 * @param bytes
	 * @return
	 */
	public static Object unserialize(byte[] bytes) throws Exception {
		if(bytes == null) return null;
		ByteArrayInputStream bais = null;
		Object obj = null;
		try{
			bais = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(bais);
			obj = ois.readObject();
		}catch(Exception e) {
			throw new Exception("反序列化出错：" + e);
		}
		return obj;
	}
	
}
