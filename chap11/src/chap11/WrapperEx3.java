package chap11;

/*
 * switch 구문에서 조건값으로 사용 가능한 자료형
 * byte, short, int, char + String
 * Byte, Short, Integer, Character
 */

public class WrapperEx3 {
	public static void main(String[] args) {
		byte dataByte = 1;
		switch(dataByte) {
		default : System.out.println("switch 테스트");
		}
		short dataShort = 1;
		switch(dataShort) {
		default : System.out.println("switch 테스트");
		}
		int dataInt = 1;
		switch(dataInt) {
		default : System.out.println("switch 테스트");
		}
		char dataChar = 'a';
		switch(dataChar) {
		default : System.out.println("switch 테스트");
		}
		String dataString = "a";
		switch(dataString) {
		default : System.out.println("switch 테스트");
		}
		Byte dataByteWrapper = 1;
		switch(dataByteWrapper) {
		default : System.out.println("switch 테스트");
		}
		Integer dataIntegerWrapper = 1;
		switch(dataIntegerWrapper) {
		default : System.out.println("switch 테스트");
		}
		Character dataCharacterWrapper = 'c';
		switch(dataCharacterWrapper) {
		default : System.out.println("switch 테스트");
		}
		Short dataShortWrapper = 1;
		switch(dataShortWrapper) {
		default : System.out.println("switch 테스트");
		}
	}
}
