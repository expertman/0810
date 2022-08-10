/* 1. 생성방법
 *     - 지역클래스가 속해있는 메소드가 호출되어야 하고,
 *     - 해당 메소드 내에서 클래스 선언이 먼저, 그 다움 생성자로 생성
 * 2. 제한 사항
 * 		1)접근제한자(Access Modifier)를 사용할 수 없다.
 * 		2)static 사용 불가
 *      3)static 변수/ static method를 가질 수 없다. 
 */
public class OuterClass2 {
	private String name = "한지민";  //Outer class member variable
	private static int age = 26;    //Outer class static variable
	public void display() {}  //Outer class member method
	public static void print() {}  //Outer class static method
	public void mymethod() {
		boolean flag = true;   //local variable
		//InnerClass2 inner = new InnerClass2();
		class InnerClass2{   //Inner class
			private double avg = 89.5;  //Inner class member variable
			//private static char grade;    //Inner class static variable
			public void repair() {
				//System.out.println("나는 로컬 이너클래스의 멤버 메소드");
				System.out.println("flag = " + flag);
			}      //Inner class member method
			//public static void sort() {}   //Inner class static method
		}
		InnerClass2 inner = new InnerClass2();
		inner.repair();
	}
}
