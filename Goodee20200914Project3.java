package GoodeeJavaStudy;
/* �ĺ��ڿ� �����Ͽ�(Camel naming)
 * 		Ŭ������ : ù ���� �빮�ڷ�, ���� �빮�� -> ProductMain()
 * 		�żҵ�� : ù ���� �ҹ���, ���� �빮�� -> productFunction()
 * 		������ : ù ���� �ҹ���, ���� �빮�� -> productValue()
 * 		����� : ��ü �빮�� ǥ��, ���� "_" -> PRODUCT_LIMIT
 * 
 * ������ ���� �߻��� �� �ִ� ���� ����
 * 1. �ĺ��ڴ� �ݵ�� ���ڿ� ����, "_", "$" �� ����
 * 		��) max_num(����) / max-num(�Ұ���) -> - ��� �ϸ� �ȵ�, -(���� ������) �� �̹̰� �ֱ� ����!
 * 2. ���ڷ� ������ ���� ����
 * 		��) num1(����), but 1Num(�Ұ���) -> ���ڷ� �����ϸ� �ȵ�
 * 3. "_", "$" ���� ����!
 * 		��) _ID(����) / $ID(����)
 * 4. ����� �ĺ��� ��� �Ұ�
 * 		��) boolean true(�Ұ���) true�� boolean �ڷ��� ���� �ĺ����̱� ������!
 */
public class Goodee20200914Project3 {
	public static void main(String[] args) {
		int max_num = 10;
		//int max-num = 10; //�Ұ���
		int num1 = 10;
		//int 1num = 10; //�Ұ���
		int _ID = 10;
		int $ID = 10;
		int True = 10;
		//boolean true = true;
		System.out.println(max_num + ',' + num1 + ',' + _ID + ',' + $ID + ',' + True);
	}
}
