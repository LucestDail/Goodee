package Exam;

/**
 * LambdaInterface3 �������̽��� �̿��Ͽ�, ���� ������� 
 * @author GDJ30
 *
 */
@FunctionalInterface
interface LambdaInterface3{
	void method(int x);
}
public class Exam1 {
	public static void main(String[] args) {
		LambdaInterface3 f = (x) -> {
			int sum = 0;
			for(int i = 1; i <= x; i++) {
				sum += i;
			}
			System.out.println("1 ~ "+x+" ������ �� : " + sum);
		};
		f.method(4);
		f.method(10); // 55;
		f.method(100); // 5050;
	}

}
