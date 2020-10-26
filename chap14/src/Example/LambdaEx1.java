package Example;
/**
 * ���ٽ� ���� : jdk8.0 ���ĺ��� ����� ����
 * ���ٽĿ��� ���Ǵ� �������̽��� FunctionalInterface ���߸� �մϴ�.
 * FunctionalInterface : �߻�޼ҵ尡 �Ѱ��� �����ϴ� �޼ҵ�
 * �߻� �޼ҵ��� �Ű������� ����, ����Ÿ�Ե� ���� ���
 * () -> {......}
 * ���ٽ� ���ο��� ����Ǵ� ������ 1������ ���� {} ������ ����
 * @author GDJ30
 */
@FunctionalInterface // => ������̼�
interface LambdaInterface1{
	void method();
}


public class LambdaEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaInterface1 fi = new LambdaInterface1() {
			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println("���� ������� �ڵ�");
				
			}
		};
		fi.method();
		
		fi = ()->{
			String str = "�̰� ���ٹ��";
			System.out.println(str);
		};
		fi.method();
		
		fi = ()->System.out.println("�Ǵٸ� ���� ���");
		fi.method();
		execute(()->System.out.println("�̰��� ������ ����"));
	}
	static void execute(LambdaInterface1 f) {
		f.method();
	}

}
