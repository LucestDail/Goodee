package chap4;
/*
 * switch ���� ���ǰ� ��� ������ �ڷ���
 * byte, short, int, char, String
 * double, long, float ���ǰ� �Ұ���
 * ��� ����ġ ������ if ������ ���� ����
 * ��� if �� ����ġ �������� ������ �Ұ���
 * �ֳ��ϸ� ���� ������ �ڷ������� ���ѵǱ� ������
 * 
 */
public class SwitchEx3 {
	public static void main(String[] args) {
		byte value = 1;
		//short value = 1;
		//int value = 1;
		//char value = 1;
		//String value = 1;
		//double value = 1;
		//long value = 1;
		//float value = 1;
		switch(value) {
		case 1 :
			System.out.println(value);
			break;
		default : 
			System.out.println(value);
			break;
		}	
	}
}
