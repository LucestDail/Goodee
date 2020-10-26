package Example;
/**
 * �߻�޼ҵ��� �Ű������� �ְ�, ����Ÿ���� ���� ���
 * (�Ű�����) -> {......}
 * �Ű� ������ ������ �Ѱ��� ��� () ���� ����
 * ���� ������ �� ������ ��� {} ���� ����
 * @author GDJ30
 *
 */
@FunctionalInterface
interface LambdaInterface3{
	void method(int a);
}

public class LambdaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LambdaInterface3 fi = (a)->{
			System.out.println(a*5);
		};
		fi.method(2);
		fi.method(10);
		fi = x -> System.out.println((x + x));
		fi.method(2);
		fi.method(10);
		System.out.println("===========");
		calc((x) -> System.out.println(x + x));
		calc((x) -> System.out.println(x*x));
	}
	
	static void calc(LambdaInterface3 f) {
		f.method(10);
	}

}
