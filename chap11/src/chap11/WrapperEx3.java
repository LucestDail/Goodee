package chap11;

/*
 * switch �������� ���ǰ����� ��� ������ �ڷ���
 * byte, short, int, char + String
 * Byte, Short, Integer, Character
 */

public class WrapperEx3 {
	public static void main(String[] args) {
		byte dataByte = 1;
		switch(dataByte) {
		default : System.out.println("switch �׽�Ʈ");
		}
		short dataShort = 1;
		switch(dataShort) {
		default : System.out.println("switch �׽�Ʈ");
		}
		int dataInt = 1;
		switch(dataInt) {
		default : System.out.println("switch �׽�Ʈ");
		}
		char dataChar = 'a';
		switch(dataChar) {
		default : System.out.println("switch �׽�Ʈ");
		}
		String dataString = "a";
		switch(dataString) {
		default : System.out.println("switch �׽�Ʈ");
		}
		Byte dataByteWrapper = 1;
		switch(dataByteWrapper) {
		default : System.out.println("switch �׽�Ʈ");
		}
		Integer dataIntegerWrapper = 1;
		switch(dataIntegerWrapper) {
		default : System.out.println("switch �׽�Ʈ");
		}
		Character dataCharacterWrapper = 'c';
		switch(dataCharacterWrapper) {
		default : System.out.println("switch �׽�Ʈ");
		}
		Short dataShortWrapper = 1;
		switch(dataShortWrapper) {
		default : System.out.println("switch �׽�Ʈ");
		}
	}
}
