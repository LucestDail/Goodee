package chap6;

/*
 * 
 * 3. ������ ǥ���ϴ� Coion Ŭ���� �����ϱ�
 * ������� :  ������ ��(side)
 *  ����޼��� : flip() 
 *  ��� : ������ ���� ������ ���� �����Ѵ�.
 *  Math.random() �޼��� �̿�. �ո�,�޸� �����.
 */


class Coin{
	boolean side = false;
	void flip() {
		float judge = (float) (Math.random());
		if(judge > 0.5)
			side = false;
		else
			side = true;
		System.out.println(side ? "�ո�" : "�޸�");
	}
}

public class Homework3 {
	public static void main(String[] args) {
		Coin c1 = new Coin();
		c1.flip();
	}
}
