package GoodeeJavaStudy;
/* 식별자와 관련하여(Camel naming)
 * 		클래스명 : 첫 문자 대문자로, 띄어쓰기 대문자 -> ProductMain()
 * 		매소드명 : 첫 문자 소문자, 띄어쓰기 대문자 -> productFunction()
 * 		변수명 : 첫 문자 소문자, 띄어쓰기 대문자 -> productValue()
 * 		상수명 : 전체 대문자 표현, 띄어쓰기 "_" -> PRODUCT_LIMIT
 * 
 * 컴파일 오류 발생할 수 있는 오류 정리
 * 1. 식별자는 반드시 문자와 숫자, "_", "$" 만 가능
 * 		예) max_num(가능) / max-num(불가능) -> - 사용 하면 안됨, -(빼기 연산자) 의 이미가 있기 때문!
 * 2. 숫자로 시작할 수는 없음
 * 		예) num1(가능), but 1Num(불가능) -> 숫자로 시작하며 안됨
 * 3. "_", "$" 시작 가능!
 * 		예) _ID(가능) / $ID(가능)
 * 4. 예약어 식별자 사용 불가
 * 		예) boolean true(불가능) true는 boolean 자료형 예약 식별자이기 때문에!
 */
public class Goodee20200914Project3 {
	public static void main(String[] args) {
		int max_num = 10;
		//int max-num = 10; //불가능
		int num1 = 10;
		//int 1num = 10; //불가능
		int _ID = 10;
		int $ID = 10;
		int True = 10;
		//boolean true = true;
		System.out.println(max_num + ',' + num1 + ',' + _ID + ',' + $ID + ',' + True);
	}
}
