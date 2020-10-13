package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx2 {

	public static void main(String[] args) {
		String[] patterns = {
				".", // ���� �ϳ�
				"[0-9]",//���� ���� �Ѱ�
				"[a-z]?", //�ҹ��ڰ� 0�� Ȥ�� 1��
				"[0-9]+", //���ڰ� 1�� �̻�
				"^[0-9]", // ���ڷ� �����ϴ� ���ڿ�
				"[^0-9]", //^(����) ���ڿ� ����
				"[a-z]*", //�ҹ��� 0�� �̻�
				"[a-z]+", // �ҹ��ڰ� 1�� �̻�
				"02|010", //02 �̰ų�, 010 �̰ų�
				"\\w&{0,}",//Ư�����ڰ� �ƴϰ� 1�ڸ� �̻��� ����
				"{3}", // 3�ڸ� ����
				"{2,}", //�ּ� 2�ڸ� ����
				"{1,3}", // 1�ڸ� ~ 3�ڸ� ����
				"\\s", //������ ����
				"\\S", // ������ �ƴ� ����
				"\\d", // ������ ����
				"\\D", // ���ڰ� �ƴ� ����
				"\\w", // �빮�� �ҹ��� ���� �� Ư����ȣ�� �ƴ� �Ϲݹ���
				"\\W"//Ư������
				
		};
		String[] datas = {
				"a1",
				"",
				"a",
				"1",
				"12",
				"012",
				"abc",
				"02",
				" ",
				"A",
				"5",
				"a",
				"*"
		};
		for(String d : datas) {
			if(d.equals("")) {
				System.out.print("����\"\"�� ���� => ");
			}else if(d.equals(" ")) {
				System.out.print("���鹮�� \" \" �� ���� => ");
			}else {
				System.out.print(d + " ������ ���� => ");
			}
			for(String p : patterns) {
				Pattern pattern = Pattern.compile(p);
				Matcher m = pattern.matcher(d);
				if(m.matches()) {
					System.out.print(p + ", ");
				}
			}
			System.out.println();
		}
	}

}
