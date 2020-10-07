package chap11;
/*
 * String 크래스 : format 메소드 예제
 * 				=> 형식화 문자를 사용할 수 있는 메소드
 * 				=> 클래스 메소드임
 */
public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(String.format("%.2f", 0.124));//소수점 이하 2자리만 출력
		//3자리값이 5이상일 경우는 반올림, %f : 실수형 숫자를 형식화하는 기호
		
		System.out.println(String.format("%10d", 12345));
		//10진 숫자를 10자리 확보하여, 좌측정렬출력
		
		System.out.println(String.format("%-10d", 12345));
		//10진 숫자를 10자리 확보하여, 우측정렬출력
		
		System.out.println(String.format("%010d", 12345));
		//10진 숫자를 10자리 확보하여 좌측출력, 빈자리 0으로 채움
		
		System.out.println(String.format("%,10d", 12345));
		//3자리수마다 , 입력
		
		System.out.println(String.format("%X", 255));
		//16진 정수를 형식화, 대문자로 표시
		
		System.out.println(String.format("%x", 255));
		//16진 정수를 형식화, 대문자로 표시
		
		System.out.println(String.format("%o", 12345));
		//8진 정수를 형식화, 대문자로 표시
		
		System.out.println(String.format("%s", "홍길동"));
		//문자 형식화 기호
		
		System.out.println(String.format("%c", 'A'));
		//char 형식 기호
		
		System.out.println(String.format("%s의 학점은 %c입니다.", "홍길동",'A'));
		//문자열, 단문자 형식 종합
	}

}
