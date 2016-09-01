package genericity;

public class genericityTest {

	public static void main(String[] args) {

		Genericity genericity = new Genericity();

		System.out.println("---------------------------测试一--------------");
		// Test1.创建不同类型数组： Integer, Double 和 Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("整型数组元素为:");
		genericity.printArr(intArray); // 传递一个整型数组

		System.out.println("\n双精度型数组元素为:");
		genericity.printArr(doubleArray); // 传递一个双精度型数组

		System.out.println("\n字符型数组元素为:");
		genericity.printArr(charArray); // 传递一个字符型数组

		
		System.out.println("--------------------测试二--------------------");
		// Test2.测试不同类型的数据比较
		System.out.printf("%d, %d 和 %d 中最大的数为 %d\n\n", 3, 4, 5, genericity.maxNum(3, 4, 5));
		System.out.printf("%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n", 6.6, 8.8, 7.7, genericity.maxNum(6.6, 8.8, 7.7));
		System.out.printf("%s, %s 和 %s 中最大的数为 %s\n", "pear", "apple", "orange",
				genericity.maxNum("pear", "apple", "orange"));
	
	
		System.out.println("---------------------------测试三--------------------");
		Box<Integer> box = new Box<Integer>();
		box.setT(new Integer("1231"));
		Box<String> box2 = new Box<String>();
		box2.setT("测试泛型类");
		
		System.out.println(box.getT());
		System.out.println(box2.getT());
	}
}
