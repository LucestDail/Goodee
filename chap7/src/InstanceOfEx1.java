package src;
/*
 * �ν��Ͻ�����(InstanceOf)��ü�� ���������� ���谪�� ��ȯ
 * 
 */
public class InstanceOfEx1 {

	public static void main(String[] args) {
		Parent3 p = new Parent3();
		if(p instanceof Child3) {
			System.out.println("p �� Child3 ��ü��");
			Child3 c = (Child3)p;
			System.out.println(c.x);
		}else
			System.out.println("p �� Child3 ��ü�ƴ�");
		if(p instanceof Parent3) {
			System.out.println("p �� Parent3 ��ü��");
		}else
			System.out.println("p �� Parent3 ��ü�ƴ�");
		if(p instanceof Object)	{
			System.out.println("p �� Object ��ü��");
			Object o = (Object)p;
		}else
			System.out.println("p �� Object  ��ü�ƴ�");
		
	}

}
