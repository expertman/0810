
public class AnnoymousInnerClassDemo {
	public static void main(String[] args) {
		//Car car = new Car();
		//car.print();
		Car car = new Car() {
			@Override
			public void print() {
				System.out.println("Hello, Java World!!!");
			}
		};
		car.print();
//		MyInterface mi = new MyInterface() {
//			@Override
//			public int calculate(int a, int b) {
//				return a + b;
//			}
//		};
//		int result = mi.calculate(5,  7);
//		System.out.println("result = " + result);
//		mi = new MyInterface() {
//			@Override
//			public int calculate(int a, int b) {
//				return a * b;
//			}
//		};
//		result = mi.calculate(5, 7);
//		System.out.println("result = " + result);
	}
}
