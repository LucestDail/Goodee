package chap11;

public class StringEx2 {

	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		System.out.println(s.charAt(4)); // ���� ����, 'E'
		System.out.println(s.compareTo("abc")); // ���� ũ�� ��, 'A' - 'a' = 32
		System.out.println(s.compareToIgnoreCase("abcdefgh")); //��ҹ��� ������� ù��° ���� ��
		System.out.println(s.concat("abc")); // ���ڿ� ���̱�
		System.out.println(s.endsWith("GH")); // ���ڿ��� ��ġ�ϴ���?
		System.out.println(s.startsWith("ABC")); // ���ڿ��� ��ġ�ϴ���?
		System.out.println(s.equals("ABCDEFGH")); // ��ҹ��ڱ��� �� ��
		System.out.println(s.equalsIgnoreCase("abcdEFGH")); // ��ҹ��� ���� ��
		
		s = new String("This is a String");
		System.out.println(s.indexOf('i')); //���� ��ġ �ε����� ����
		System.out.println(s.indexOf('i',12)); // �Է��� �ε���(5)���� �ش��ϴ� ������ ��ġ �ε�����
		System.out.println(s.indexOf("is"));//"is" ���ڿ� ��ġ ��ȯ : 2
		
		System.out.println(s.lastIndexOf("is"));// �ڿ������� "is" ���ڿ� ��ġ ��ȯ : 5
		System.out.println(s.length()); // ���ڿ��� ���� ��ȯ
		System.out.println(s.replace("is", "QR"));// ���ڿ��� ��ü
		
		System.out.println(s.substring(5)); // �κ� ���ڿ�, 5�� ���� ���ڿ� ��ȯ
		System.out.println(s.substring(5, 13)); // �κ� ���ڿ�, 5�� ���� ���ڿ� 13������ ��ȯ

		System.out.println(s.toLowerCase()); // ��ü �� �ҹ��ڷ�
		System.out.println(s.toUpperCase()); // ��ü �� �빮�ڷ�
		
		System.out.println("   �� �� �� �� �� �� �� t r i m   ".trim()); // ���� ����
		String[] sarr = "a,b,c".split(",");
		for(String ss : sarr)
		System.out.println(ss);
	}

}