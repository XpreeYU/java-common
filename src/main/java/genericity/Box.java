package genericity;

/**
 * 创建一个泛型类
 * 
 * @author yujiansong
 * @param <T>
 */
public class Box<T> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}