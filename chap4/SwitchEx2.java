package chap4;

public class SwitchEx2 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 10) + 1;
		String[] prize = {"������","USB","Ű����","","","","","","","",""};
		switch(num) {
		case 1:System.out.println("�����մϴ�. " +prize[num-1]+"�� ��÷�Ǿ����ϴ�.");break;
		case 2:System.out.println("�����մϴ�. " +prize[num-1]+"�� ��÷�Ǿ����ϴ�.");break;
		case 3:System.out.println("�����մϴ�. " +prize[num-1]+"�� ��÷�Ǿ����ϴ�.");break;
		default:System.out.println("�ƽ����ϴ�. ���� ��ȸ��");
		}
	}
}