package chap6;

public class Exam2 {
	public static void main(String[] args) {
		Rectangle2[] rarr = new Rectangle2[5];
		int AreaSum = 0;
		int LengthSum = 0;
		//������ 20 ~ 50 ���� ����, ���� ���� ���� �簢�� 5�� ����
		// ��� �簢���� ����, �ѷ� �� ���
		for(int i = 0; i < rarr.length;i++) {
			rarr[i] = new Rectangle2();
			rarr[i].width = (int)(Math.random()*30)+20;
			rarr[i].height = (int)(Math.random()*30)+20;
			rarr[i].serialNo = ++Rectangle2.sno;
			AreaSum += rarr[i].area();
			LengthSum += rarr[i].length();
		}
		for(int i = 0; i < rarr.length;i++) {
			System.out.println(rarr[i].toString());
		}
		System.out.println("��ü �簢�� ������ �� : " + AreaSum);
		System.out.println("��ü �簢�� �ѷ��� �� : " + LengthSum);
	}
}
