package chap4;
/*
 * switch 구문 조건값 사용 가능한 자료형
 * byte, short, int, char, String
 * double, long, float 조건값 불가능
 * 모든 스위치 구문은 if 문으로 변경 가능
 * 모든 if 를 스위치 구문으로 변경이 불가능
 * 왜냐하면 선택 범위나 자료형에서 제한되기 때문에
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
